import scala.annotation.tailrec

object Solution {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
        @tailrec
    def go(i: Int, mp: Map[String, List[String]]): List[List[String]] = {
      if (i == strs.length) mp.values.toList
      else {
        val key = strs(i).sorted.mkString
        go(i + 1, mp + (key -> mp.get(key).map { value =>
          value :+ strs(i)
        }.getOrElse(List(strs(i)))))
      }
    }
    go(0, Map.empty[String, List[String]])
    }
}