object Solution {
    def originalDigits(s: String): String = {
    val arr = new Array[Int](26)
    for (i <- 0 until s.length) arr(s(i) - 'a') = arr(s(i) - 'a') + 1
    val num = new Array[Int](10)
    num(0) = arr('z' - 'a')
    num(2) = arr('w' - 'a')
    num(4) = arr('u' - 'a')
    num(6) = arr('x' - 'a')
    num(8) = arr('g' - 'a')

    num(1) = arr('o' - 'a') - num(0) - num(2) - num(4)
    num(3) = arr('h' - 'a') - num(8)
    num(5) = arr('f' - 'a') - num(4)
    num(7) = arr('s' - 'a') - num(6)
    num(9) = arr('i' - 'a') - num(5) - num(6) - num(8)
    val result = (0 until 10).foldLeft(""){ (acc, i) =>
      if (num(i) > 0) acc + ("" + i) * num(i) else acc
    }
    result
  }
}