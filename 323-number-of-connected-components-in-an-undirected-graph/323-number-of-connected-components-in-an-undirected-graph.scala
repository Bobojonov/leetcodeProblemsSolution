object Solution {
   def countComponents(n: Int, edges: Array[Array[Int]]): Int = {


   val map1 = Map[Int, List[Int]]() ++ (0 until n).map(_ -> List())
    val map = edges.foldLeft(map1){ (acc, edge) =>
      val mp = acc + (edge(0) -> (acc(edge(0)) :+ edge(1)))
      mp + (edge(1) -> (acc(edge(1)) :+ edge(0)))
    }
    println(map.toList)
    val visited = new Array[Int](n)
    def dfs(map: Map[Int, List[Int]], index: Int): Unit = {
      visited(index) = 1
      map(index).foreach(v => {
        if (visited(v) == 0) dfs(map, v)
      })
    }
    val count = (0 until n).foldLeft(0){ (acc, i) =>
      if (visited(i) == 0){
        dfs(map, i)
        acc + 1
      } else acc
    }
    count
  }
}