object Solution {
    def minimumTotal(triangle: List[List[Int]]): Int = {
        val len = triangle.size
    val dp = triangle.last.toArray
    for (i <- (len - 2) to 0 by -1; j <- triangle(i).indices)
      dp(j) = triangle(i)(j) + (dp(j) min(dp(j + 1)))
    dp(0)
    }
}