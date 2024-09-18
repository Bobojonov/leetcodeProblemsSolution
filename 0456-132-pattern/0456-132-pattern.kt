class Solution {
    fun find132pattern(nums: IntArray): Boolean {
        var x = Int.MIN_VALUE
        val stack = Stack<Int>()
        for (i in nums.size - 1 downTo 0) {
            if (nums[i] < x) return true
            else while (!stack.isEmpty() && nums[i] > stack.peek()) {
                x = stack.pop() 
            }
            stack.push(nums[i])
        }
        return false
    }
}