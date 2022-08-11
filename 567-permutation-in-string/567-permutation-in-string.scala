import scala.annotation.tailrec

object Solution {
    def checkInclusion(s1: String, s2: String): Boolean = {
    if (s1.length > s2.length) false
    else {
      val map1 = new Array[Int](26)
      val map2 = new Array[Int](26)
      for (i <- 0 until s1.length){
        map1(s1.charAt(i) - 'a') += 1
        map2(s2.charAt(i) - 'a') += 1
      }
      @tailrec
      def compare(i: Int, map1: Array[Int], map2: Array[Int]): Boolean = {
        if (i == s2.length - s1.length) {
          matches(0, map1, map2)
        }
        else {
          if (matches(0, map1, map2)) true
          else {
            map2(s2.charAt(i + s1.length) - 'a') += 1
            map2(s2.charAt(i) - 'a') -= 1
            compare(i + 1, map1, map2)
          }
        }
      }
      @tailrec
      def matches(i: Int, map1: Array[Int], map2: Array[Int]): Boolean = {
        if (i == 26) true
        else {
          if (map1(i) != map2(i)) false
          else matches(i + 1, map1, map2)
        }
      }
      compare(0, map1, map2)
    }
  }
}