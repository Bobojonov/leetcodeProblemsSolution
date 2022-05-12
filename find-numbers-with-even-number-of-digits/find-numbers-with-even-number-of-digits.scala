object Solution {
    def findNumbers(nums: Array[Int]): Int = {
    nums.foldLeft(0){ (count, e) =>
      if (e.toString.length % 2 == 0) count + 1 else count
    }
  }
}