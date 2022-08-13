object Solution {
    def lastRemaining(n: Int): Int = {
      def go(n: Int, left: Boolean, x: Int, increment: Int): Int = {
        if (n <= 1) x
        else {
          if (left) go(n / 2, !left, x + increment,  increment * 2)
          else {
            if (n % 2 == 1) go(n / 2, !left, x + increment, increment * 2)
            else go(n / 2, !left, x, increment * 2)
          }
        }
      }
    go(n, true, 1, 1)
    }


}