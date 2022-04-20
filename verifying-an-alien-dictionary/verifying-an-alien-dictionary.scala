object Solution {
    def isAlienSorted(words: Array[String], order: String): Boolean = {
    val orderMap = order.zipWithIndex.toMap
    val pairs = words.zip(words.tail)
    def compare(w1: String, w2: String): Option[(Char, Char)] = w1.zip(w2).find{ case (a, b) => a != b}

    pairs.forall {pair =>
      compare(pair._1, pair._2) match {
        case Some(f) => {
          println(orderMap(f._1) < orderMap(f._2))
          orderMap(f._1) < orderMap(f._2)
        }
        case None => pair._1 <= pair._2
      }
    }
  }
}