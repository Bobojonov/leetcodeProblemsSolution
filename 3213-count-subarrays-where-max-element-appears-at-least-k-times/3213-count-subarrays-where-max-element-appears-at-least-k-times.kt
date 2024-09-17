class Solution {
    fun countSubarrays(nums: IntArray, k: Int): Long {
        var res = 0L
        val mostAppeared = Arrays.stream(nums).max().asInt
        var start = 0
        var curr = 0
        for (element in nums) {
            curr += if (element == mostAppeared) 1 else 0
            while (curr >= k) 
                curr -= if (nums[start++] == mostAppeared) 1 else 0
            res += start
        }
        return res
    }
}