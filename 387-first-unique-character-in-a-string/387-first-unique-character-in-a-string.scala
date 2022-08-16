object Solution {
    def firstUniqChar(s: String): Int = {
      val grouped = s.groupBy(identity).view.mapValues(_.length).filter(x => x._2 == 1).map(x => s.indexOf(x._1)).toList.sorted
    if (grouped.nonEmpty) grouped.head else -1
  }
}