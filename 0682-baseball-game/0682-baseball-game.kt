class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack = Stack<Int>()
        operations.forEach { operation ->
            if (operation[operation.length - 1].isDigit()) stack.push(operation.toInt())
            else if (operation[0] == 'C') stack.pop()
            else if (operation[0] == 'D') {
                stack.push(stack.peek() * 2)
            } else {
                val x = stack.pop()
                if (!stack.isEmpty()) {
                    val y = stack.pop()
                    stack.push(y)
                    stack.push(x)
                    stack.push(x + y)
                } else 
                    stack.push(x)
            }
        }
        val res = stack.fold(0) { acc, i -> 
            acc + i
        }
        return res
    }
}