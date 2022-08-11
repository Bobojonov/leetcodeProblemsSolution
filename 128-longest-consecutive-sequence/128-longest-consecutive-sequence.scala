object Solution {
    def longestConsecutive(nums: Array[Int]): Int = {
       if (nums.isEmpty) 0
    else {
      val sort = nums.sorted
      val (max, _, cnt) = sort.tail.foldLeft(0, sort(0), 1) { case ((mx, prev, acc), e) =>
        if (Math.abs(e - prev) == 1) (mx, e, acc + 1)
          else if (e - prev == 0) (mx, e, acc)
        else (math.max(mx, acc), e, 1)
      }
      math.max(max, cnt)
    }
    }
    //-1 -1 0 1 3 4 5 6 7 8 9
}