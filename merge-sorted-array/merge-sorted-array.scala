object Solution {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    val (left, _) = nums1.splitAt(m)
    val (right, _) = nums2.splitAt(n)

    println(merging(left.toList, right.toList).toArray.copyToArray(nums1, 0))
  }


  def merging(left: List[Int], right: List[Int]): List[Int] = {
    (0 until left.length + right.length).foldLeft(List[Int](), left, right) { (triple, _) =>
      val (merged, leftRemaining, rightRemaining) = triple
      (leftRemaining, rightRemaining) match {
        case (Nil, r :: rTail) => (r :: merged, Nil, rTail)
        case (l :: lTail, Nil) => (l :: merged, lTail, Nil)
        case (l :: lTail, r :: _) if l < r => (l :: merged, lTail, rightRemaining)
        case (_ :: _, r :: rTail)  => (r :: merged, leftRemaining, rTail)
        case (Nil, Nil) => (merged, leftRemaining, rightRemaining)
      }
    }._1.reverse
  }
}