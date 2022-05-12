object Solution {
    def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    def move(zeroCount: Int, k: Int, start: Int): (Int, Int) = {
      if (zeroCount > k) {
        if (nums(start) == 0) move(zeroCount - 1, k, start + 1)
        else move(zeroCount, k, start + 1)
      } else (zeroCount, start)
    }
    val maxOne = (0 until nums.length).foldLeft(0, 0, 1, 0) { case ((acc, start, k, zero_count), i) =>
      val zero = if (nums(i) == 0) zero_count + 1 else zero_count
      val (x, y) = move(zero, k, start)
      (math.max(acc, i - y + 1), y, k, x)
    }
    maxOne._1
  }
}