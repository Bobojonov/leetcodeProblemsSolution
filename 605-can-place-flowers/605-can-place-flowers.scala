object Solution {
   def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
    val newFlowers = 0 +: flowerbed :+ 0
    val len = newFlowers.length
    val (canPlace, _) = (1 until len - 1).foldLeft(n, newFlowers){ case ((acc, arr), i) =>
      if (arr(i - 1) == 0 && arr(i) == 0 && arr(i + 1) == 0){
        arr(i) = 1
        (acc - 1, arr)
      } else (acc, arr)
    }
    canPlace <= 0
  }
}