object Solution {
    def validMountainArray(arr: Array[Int]): Boolean = {
    def check(upAndDown: Int, i: Int): Boolean = {
      if (arr.length - 1 == i) {if (upAndDown == 1) true else false}
      else {
        if (arr(i) == arr(i + 1)) false
        else if (upAndDown == 0) {
          if (arr(i) < arr(i + 1)) check(upAndDown, i + 1)
          else if (i == 0) false else check(1, i + 1)
        } else if (arr(i) > arr(i + 1)) check(upAndDown, i + 1) else false
      }
    }
    if (arr.length < 3) false else check(0, 0)
  }
}