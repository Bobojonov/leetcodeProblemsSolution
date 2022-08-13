object Solution {
   def lengthLongestPath(input: String): Int = {
    val lines = input.split('\n')
    lines.foldLeft(Map(-1 -> 0), 0){
      case ((pathLeng, maxLength), line) =>
        val depth = line.count(_ == '\t')
        val length = pathLeng(depth - 1) + line.length - depth
        val newMaxLength = if (line.contains('.')) math.max(maxLength, length + depth) else maxLength
        (pathLeng.updated(depth, length), newMaxLength)
    }._2
  }
}