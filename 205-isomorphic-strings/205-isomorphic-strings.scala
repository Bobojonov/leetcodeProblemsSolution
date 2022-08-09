import scala.collection.mutable

object Solution {
    def isIsomorphic(s: String, t: String): Boolean = {
         val map1 = new mutable.HashMap[Char, Int]
    val map2 = new mutable.HashMap[Char, Int]
    !s.indices.exists (i => map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i)
    )
    }
}