object Solution {
    def minCostClimbingStairs(cost: Array[Int]): Int = {
    val n = cost.length
    val dp = Array.fill(n + 1)(0)
    for (i <- 2 to n) {
      val takeOneStep = dp(i - 1) + cost(i - 1)
      val takeTwoStep = dp(i - 2) + cost(i - 2)
      dp(i) = math.min(takeOneStep, takeTwoStep)
    }
    dp(n)
  }
}