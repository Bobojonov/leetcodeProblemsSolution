object Solution {
    def shortestDistance(wordsDict: Array[String], word1: String, word2: String): Int = {
    val (res, _, _, _) = wordsDict.foldLeft(wordsDict.length, -1, -1, 0){ case ((min, i1, i2, i), _) =>
      val x1 = if (wordsDict(i) == word1) i else i1
      val x2 = if (wordsDict(i) == word2) i else i2
      if (x1 != -1 && x2 != -1) (math.min(min, math.abs(x1 - x2)), x1, x2, i + 1)
      else (min, x1, x2, i + 1)
    }
    res
  }
}