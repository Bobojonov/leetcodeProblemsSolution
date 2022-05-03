object Solution {
    def deleteAndEarn(nums: Array[Int]): Int = {
    val dp = new Array[Int](10001)
    for (i <- nums.indices)
      dp(nums(i)) += 1
    println(dp.take(10).toList)
    for (i <- 2 to 10000)
      dp(i) = math.max(dp(i) * i + dp(i - 2), dp(i - 1))
    dp(10000)
  }
}