object Solution {
    def maxArea(height: Array[Int]): Int = {
        def searchMaxArea(l: Int, r: Int, max: Int): Int = {
      if (l < r){
        val width = r - l
        val maxx = Math.max(max, Math.min(height(l), height(r)) * width)
        if (height(l) <= height(r))
          searchMaxArea(l + 1, r, maxx)
        else searchMaxArea(l, r - 1, maxx)
      } else max
    }
    searchMaxArea(0, height.length - 1, 0)
    }
}