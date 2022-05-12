object Solution {
    def heightChecker(heights: Array[Int]): Int = {
    val sorted = heights.sorted
    heights.zip(sorted).filter(x => x._1 != x._2).length
  }
}