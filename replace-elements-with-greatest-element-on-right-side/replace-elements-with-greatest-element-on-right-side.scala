object Solution {
    def replaceElements(arr: Array[Int]): Array[Int] = {
    arr.zipWithIndex.foldLeft(Array.empty[Int]) { (acc, pair) =>
      pair match {
        case (_, i) =>
          val rightElements = arr.takeRight(arr.length - 1 - i)
          acc :+ (if (rightElements.nonEmpty) rightElements.max else -1)
      }
    }
  }
}