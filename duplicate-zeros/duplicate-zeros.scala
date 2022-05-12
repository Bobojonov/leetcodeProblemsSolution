object Solution {
    def duplicateZeros(arr: Array[Int]): Unit = {
    val list = arr.foldLeft(Array.empty[Int]){ (ls, e) =>
      if (e == 0) ls :+ 0 :+ 0 else ls :+ e
    }
    for (i <- 0 to arr.length - 1)
      arr(i) = list(i)
  }
}