object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val (mapped, _) = nums.foldLeft(Map.empty[Int, Int], 0) { case ((acc, ind), e) =>
      (acc + (e -> ind), ind + 1)
    }
    def checkTwoSum(index: Int): Array[Int] = index match {
      case index if (index == nums.length) => Array()
      case index =>
        val complement = target - nums(index)
        val idx = mapped.getOrElse(complement, -1)
        if (mapped.contains(complement) && idx != index)
          Array(index, idx)
        else checkTwoSum(index + 1)
    }
    checkTwoSum(0)
  }
}