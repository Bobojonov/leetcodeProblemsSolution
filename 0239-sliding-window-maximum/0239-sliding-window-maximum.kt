class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val res = IntArray(nums.size - k + 1)
        val dq = ArrayDeque<Int>()
        var l = 0
        var r = 0
        while (r < nums.size) {
            while (!dq.isEmpty() && nums[dq.last()] < nums[r]) dq.removeLast()
            dq.addLast(r)
            if (l > dq.first()) dq.removeFirst()
            if (r + 1 >= k) {
                res[l] = nums[dq.first()]
                l++
            }
            r++
        }
        return res
    }
}