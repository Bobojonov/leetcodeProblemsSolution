object Solution {
    def missingNumber(nums: Array[Int]): Int = {
        val n = nums.length
        (n + 1) * n / 2 - nums.sum
    }
}