class Codec {
    // Encodes a list of strings to a single string.
    def encode(strs: List[String]): String = {
    if (strs.size == 0) Character.toString(258.toChar)
    else {
      val s = Character.toString(257.toChar)
      val sb = strs.foldLeft("") { case (acc, e) =>
        acc + e + s
      }
      val res = sb.dropRight(1)
      res
    }
  }

  def decode(s: String): List[String] = {
    val dec = Character.toString(258.toChar)
    if (s.equals(dec)) List()
    else {
      val dec = Character.toString(257.toChar)
      s.split(dec, -1).toList
    }
  }
}

/**
 * Your Codec object will be instantiated and called as such:
 * var obj = new Codec()
 * val s = obj.encode(strs)
 * val ans = obj.decode(s)
 */