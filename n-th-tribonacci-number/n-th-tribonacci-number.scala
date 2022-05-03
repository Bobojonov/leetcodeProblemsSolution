object Solution {
    def tribonacci(n: Int): Int = {
      def trib(n: Int, n1: Int, n2: Int, n3: Int): Int = {
        if (n > 0) trib(n - 1, n2, n3, n1 + n2 + n3) else n1
      }
    trib(n, 0, 1, 1)
  }
}