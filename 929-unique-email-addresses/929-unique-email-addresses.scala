object Solution {
    def numUniqueEmails(emails: Array[String]): Int = {
    val s = emails.foldLeft(Set.empty[String]) { (str, e) =>
      val splitted = e.split("@")
      val filter = splitted.head
      val tail = splitted.last
      val s1 = filter.split('+').head
      str + (s1.replace(".", "") + "@" + tail)
    }
    s.size
  }  
}