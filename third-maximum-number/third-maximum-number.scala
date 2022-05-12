object Solution {
   def thirdMax(nums: Array[Int]): Int = {
        val sorted = nums.toSet.toArray.sortWith(_ > _)
    sorted.length match {
      case 1 => sorted(0)
      case 2 => sorted(0)
      case _ => sorted(2)
    }
    }
}