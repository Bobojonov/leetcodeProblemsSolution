object Solution {
    def earliestAcq(logs: Array[Array[Int]], n: Int): Int = {
    val sortedStamp = logs.sortWith((x, y) => x(0) < y(0))
    println(sortedStamp.toList.map(_.toList))
    val moments = (0 until n).toArray
    def find(x: Int): Int = {
      if(moments(x) == x) x
      else {
        moments(x) = find(moments(x))
        println(moments(x))
        moments(x)
      }
    }
    println(moments.toList)
    def union(friend1: Int, friend2: Int, connected: Int): Int = {
      val fr1 = find(friend1)
      val fr2 = find(friend2)
      if (fr1 == fr2) connected
      else {
        moments(fr1) = fr2
        connected - 1
      }
    }
    def go(i: Int, timestamp: Int): Int = {
      if (i == logs.length) -1
      else {
        val friend1 = sortedStamp(i)(1)
        val friend2 = sortedStamp(i)(2)
        println(friend1 + " " + friend2)
        if(find(friend1) != find(friend2)){
          val rem = union(friend1, friend2, timestamp)
          if (rem == 1) sortedStamp(i)(0)
          else go(i + 1, rem)
        } else go(i + 1, timestamp)
      }
    }
    go(0, n)
    }
}