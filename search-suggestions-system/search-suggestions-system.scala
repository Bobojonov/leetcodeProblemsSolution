object Solution {
    def suggestedProducts(products: Array[String], searchWord: String): List[List[String]] = {
    searchWord.indices.foldLeft(List.empty[List[String]], products.sorted.toList) { (acc, i) =>
      val filtered = acc._2.filter(p => p.length > i && p(i) == searchWord(i))
      println(filtered)
      println(filtered.take(3))
      (acc._1 :+ filtered.take(3), filtered)
    }._1
  }
}