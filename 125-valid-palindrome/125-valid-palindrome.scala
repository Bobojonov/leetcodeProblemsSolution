object Solution {
    def isPalindrome(s: String): Boolean = {
        def twoPointer(i: Int, j: Int): Boolean = {
      if (i < j){
        if (!s.charAt(i).isLetterOrDigit && !s.charAt(j).isLetterOrDigit)
          twoPointer(i + 1, j - 1)
        else if (!s.charAt(i).isLetterOrDigit) twoPointer(i + 1, j)
        else if (!s.charAt(j).isLetterOrDigit) twoPointer(i, j - 1)
        else if (s.charAt(i).toLower != s.charAt(j).toLower) false
        else twoPointer(i + 1, j - 1)
      } else true
    }
    twoPointer(0, s.length - 1)
    }
}