class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
       val stack = Stack<Int>()
        var i = 0
        while (i < asteroids.size) {
            if (asteroids[i] > 0 || stack.isEmpty() || stack.peek() < 0) stack.push(asteroids[i])
            else if (stack.peek() <= -asteroids[i]) {
                if (stack.peek() < -asteroids[i]) i--
                stack.pop()
            }
            i++
        }
        println(stack)
        val res = IntArray(stack.size)
        stack.fold(0) { acc, i ->
            res[acc] = i
            acc + 1
        }
        return res
    }
}