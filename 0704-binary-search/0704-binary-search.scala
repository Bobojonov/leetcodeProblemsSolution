object Solution {
    def search(nums: Array[Int], target: Int): Int = {
    def binary(left: Int, right: Int): Int = {
      if (right >= left){
        val mid = left + (right - left) / 2
        if (nums(mid) == target) mid else if (nums(mid) > target) binary(left, right - 1) else binary(left + 1, right)
      } else -1
    }
    binary(0, nums.length - 1)
  }
}