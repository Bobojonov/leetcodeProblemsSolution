object Solution {
    def threeSum(nums: Array[Int]): List[List[Int]] = {
        val num = nums.sorted
    var res = Set.empty[List[Int]]
    for (l <- 0 until nums.length - 2){
      val mid = l + 1
      val r = nums.length - 1
      res = binsearch(l, r, mid, res)
    }
    def binsearch(l: Int, r: Int, mid: Int, res: Set[List[Int]]): Set[List[Int]] = {
      if (mid < r){
        val sum = num(l) + num(mid) + num(r)
        if (sum < 0) binsearch(l, r, mid + 1, res)
        else if (sum > 0) binsearch(l, r - 1, mid, res)
        else {
          val triplet = List(num(l), num(mid), num(r))
          binsearch(l, r, mid + 1, res + triplet)
        }
      } else res
    }
    res.toList
    }
}