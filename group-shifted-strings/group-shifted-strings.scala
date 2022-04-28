object Solution {
    def groupStrings(strings: Array[String]): List[List[String]] = {
    strings.groupBy(s => s.map(x => {(x.toInt + 26 - s(0).toInt)% 26
    })).map(_._2.toList).toList
  }
}