class Solution {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        val stack = Stack<Int>()
        var i = 0
        for (push in pushed) {
            if (push == popped[i]) {
                stack.push(push)
                while (!stack.isEmpty() && stack.peek() == popped[i]) {
                    stack.pop()
                    i++
                }
            } else {
                stack.push(push)
            }
        }
        return stack.isEmpty()
    }
}