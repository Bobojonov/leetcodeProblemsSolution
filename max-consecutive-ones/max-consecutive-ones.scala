object Solution {
    def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    def countOnes(max: Int, sum: Int, i: Int): Int = {
      if (i == nums.length) math.max(sum, max)
      else {
        if (nums(i) == 0) countOnes(math.max(max, sum), 0, i + 1)
        else countOnes(max, sum + 1, i + 1)
      }
    }
    countOnes(0, 0, 0)
  }
}