object Solution {
    def isAnagram(s: String, t: String): Boolean = {
        if (s.length != t.length) false
    else s.groupBy(identity).equals(t.groupBy(identity))
    }
}