object Solution {
    def subdomainVisits(cpdomains: Array[String]): List[String] = {
    val count_pairs = cpdomains.foldLeft(Map.empty[String, Int]) { (acc, e) =>
      val domain = e.split(" ")
      val splitDots = domain(1).split('.')
      val all_domains = splitDots.foldRight(List.empty[String], "") { (str, acc) =>
        val s = str + acc._2
        (s +: acc._1, '.' + s)
      }
      val visits = domain(0).toInt
      all_domains._1.foldLeft(acc) { (map, e) =>
        map + (e -> (map.getOrElse(e, 0) + visits))
      }
    }
    println(count_pairs)
    count_pairs.foldLeft(List.empty[String]) { case (acc, (key, value)) =>
      acc :+ (value.toString + " " + key)
    }
  }
}