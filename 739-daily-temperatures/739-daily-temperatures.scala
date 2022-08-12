import scala.collection.mutable

object Solution {
    def dailyTemperatures(temperatures: Array[Int]): Array[Int] = {
    val stack = new mutable.ArrayDeque[Int]()
    val answer = new Array[Int](temperatures.length)
    for (currDay <- 0 until temperatures.length) {
      val currTemp = temperatures(currDay)
      while (stack.nonEmpty && temperatures(stack.last) < currTemp) {
        val prevDay = stack.remove(stack.length - 1)
        answer(prevDay) = currDay - prevDay
      }
      stack.addOne(currDay)
    }
    answer
  }
}