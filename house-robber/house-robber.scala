object Solution {
   def rob(nums: Array[Int]): Int = {
    if (nums.length == 1) nums(0)
    else if (nums.length == 2) math.max(nums(0), nums(1)) 
    else {
      val dp = new Array[Int](nums.length)
      dp(0) = nums(0)
      dp(1) = math.max(nums(0), nums(1))
      for (i <- 2 to nums.length - 1)
        dp(i) = math.max(dp(i - 1), dp(i - 2) + nums(i))
      dp(nums.length - 1)
    }
  }  
}