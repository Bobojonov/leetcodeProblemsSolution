object Solution {
   def findMaxLength(nums: Array[Int]): Int = {
    def go(sum: Int,  maxx: Int, map: Map[Int, Int], i: Int): Int = {
      if (i == nums.length) maxx
      else {
        val x = sum + (if (nums(i) == 1) 1 else -1)
        if (map.contains(x)) {
          val idx = map.getOrElse(x, 0)
          val len = i - idx
          go(x, math.max(maxx, len), map, i + 1)
        }
        else go(x, maxx, map + (x -> i), i + 1)
      }
    }
    go(0, 0, Map(0 -> -1), 0)
  }
}