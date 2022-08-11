import scala.annotation.tailrec

object Solution {
    def isValid(s: String): Boolean = {
        @tailrec
    def check(i: Int, stack: String): Boolean = {
      if (i == s.length) stack.isEmpty
      else {
        if (s(i) == '(' || s(i) == '{' || s(i) == '[') check(i + 1, stack + s(i))
        else if (stack.isEmpty) false
        else if (s(i) == ')' && stack.last == '(') check(i + 1, stack.dropRight(1))
        else if (s(i) == '}' && stack.last == '{') check(i + 1, stack.dropRight(1))
        else if (s(i) == ']' && stack.last == '[') check(i + 1, stack.dropRight(1))
        else false
      }
    }
    check(0, "")
    }
}