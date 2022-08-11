object Solution {
    def trap(height: Array[Int]): Int = {
      def search(l: Int, r: Int, left_max: Int, right_max: Int, ans: Int): Int = {
      if (l < r) {
        if (height(l) < height(r)) {
          if (height(l) >= left_max) search(l + 1, r, height(l), right_max, ans)
          else search(l + 1, r, left_max, right_max, ans + left_max - height(l))
        }
        else {
          if (height(r) >= right_max) search(l, r - 1, left_max, height(r), ans)
          else search(l, r - 1, left_max, right_max, ans + right_max - height(r))
        }
      } else ans
    }
    search(0, height.length - 1, 0 ,0 , 0)
    }
}