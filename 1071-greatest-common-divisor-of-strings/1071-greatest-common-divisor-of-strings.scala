object Solution {
    def gcdOfStrings(str1: String, str2: String): String = {
            if (str1 == null || str2 == null) ""
    else {
      val len1 = str1.length
      val len2 = str2.length
      val len  = Math.min(len1, len2)
      for (i <- len until 0 by -1) {
        val pattern = str2.substring(0, i)
        if (len1 % i == 0 && len2 % i == 0) {
          val s1 = pattern * (len1 / i)
            if (str1 == null || str2 == null) ""
    else {
      val len1 = str1.length
      val len2 = str2.length
      val len  = Math.min(len1, len2)
      for (i <- len until 0 by -1) {
        val pattern = str2.substring(0, i)
        if (len1 % i == 0 && len2 % i == 0) {
          val s1 = pattern * (len1 / i)
          val s2 = pattern * (len2 / i)
          if (s1.equals(str1) && s2.equals(str2)) return pattern
        }
      }
      ""
    }
          val s2 = pattern * (len2 / i)
          println(s2)
          if (s1.equals(str1) && s2.equals(str2)) return pattern
        }
      }
      ""
    }
    }
}