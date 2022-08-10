object Solution {
    def productExceptSelf(nums: Array[Int]): Array[Int] = {
        val left_sum = new Array[Int](nums.length)
    val right_sum = new Array[Int](nums.length)
    left_sum(0) = 1
    right_sum(nums.length - 1) = 1
    for (i <- 1 until nums.length)
      left_sum(i) = left_sum(i - 1) * nums(i - 1)
    for (i <- nums.length - 2 to 0 by -1)
      right_sum(i) = right_sum(i + 1) * nums(i + 1)
    val result = new Array[Int](nums.length)
    for (i <- 0 until nums.length)
      result(i) = left_sum(i) * right_sum(i)
    result
    }
}