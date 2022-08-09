object Solution {
    def isSubsequence(s: String, t: String): Boolean = s match{
    case ch if ch.isEmpty => true
    case _ if t.isEmpty => false
    case _ if s.head == t.head => isSubsequence(s.drop(1), t.drop(1))
    case _ if s.head != t.head => isSubsequence(s, t.drop(1))
  }

}