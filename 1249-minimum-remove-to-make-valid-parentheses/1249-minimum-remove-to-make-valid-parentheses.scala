object Solution {
    def minRemoveToMakeValid(s: String): String = {
    val (list, index, _) = s.foldLeft(List.empty[Int], Set.empty[Int], 0) { (acc, ch) =>
      val (stack, set, i) = acc
      if (ch == '(') (i +: stack, set, i + 1)
      else if (ch == ')'){
        if (stack.isEmpty)(stack, set + i, i + 1)
        else (stack.tail, set, i + 1)
      } else (stack, set, i + 1)
    }
    println(list)
    println(index)
    val st = list.reverse.foldLeft(index)( (acc, e) => acc + e)
    println(st)
    val (result, _) = s.foldLeft("", 0){ case ((acc, i), e) =>
      if (!st.contains(i)) (acc + e, i + 1)
      else (acc, i + 1)
    }
    result
  }
}