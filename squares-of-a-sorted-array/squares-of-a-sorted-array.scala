object Solution {
    def sortedSquares(nums: Array[Int]): Array[Int] = {
    nums.map(x => x * x).sorted
  }
}