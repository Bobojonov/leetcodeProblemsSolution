class Solution {
    fun maxSubarrayLength(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, Int>()
        var start = 0
        var res = 0
        for (i in nums.indices) {
            map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
            while (map[nums[i]]!! > k) map[nums[start]] = map[nums[start++]]!! - 1
            res = res.coerceAtLeast(i - start + 1)
        }
        return res
    }
    

}