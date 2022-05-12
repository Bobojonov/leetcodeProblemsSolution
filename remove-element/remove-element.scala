object Solution {
    def removeElement(nums: Array[Int], `val`: Int): Int = {
    val x = nums.filter(_ != `val`)
    for (i <- 0 until x.length){
      if (i >= x.length) nums(i) -= nums(i)
      else nums(i) = x(i)
    }
    x.length
  }
}