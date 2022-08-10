object Solution {
    def isValidSudoku(board: Array[Array[Char]]): Boolean = {
       var set = Set.empty[String]
        var res = true
    for (i <- 0 until 9){
      for (j <- 0 until 9){
        board match {
          case ch if board(i)(j) != '.' =>
            val x = "(" + board(i)(j) + ")"
            if (set.contains(x + i) || set.contains(j + x) || set.contains(i / 3 + x + j / 3)) res = false
            else {
              set = set + (x + i)
              set = set + (j + x)
              set = set + (i / 3 + x + j / 3)
            }
          case _ =>
        }
      }
    }
    res 
    }
}