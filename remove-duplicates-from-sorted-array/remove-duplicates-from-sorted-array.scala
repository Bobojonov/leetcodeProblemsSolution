object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
    val dup = nums.distinct
    for (i <- 0 until nums.length){
      if (i >= dup.length) nums(i) -= nums(i)
      else nums(i) = dup(i)
    }
    dup.length
  }
}