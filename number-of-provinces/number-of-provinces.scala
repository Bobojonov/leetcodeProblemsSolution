object Solution {
    def findCircleNum(isConnected: Array[Array[Int]]): Int = {
        val cities = isConnected.indices.toArray
        var provinces = isConnected.length
        def find(k: Int): Int = {
            if (cities(k) == k) k
            else{
                cities(k) = find(cities(k))
                cities(k)
            }
        }
        def union(c1: Int, c2: Int): Unit = {
            val p1 = find(c1)
            val p2 = find(c2)
            if (p1 != p2){
                cities(p1) = p2
                provinces -= 1
            }
        }
        isConnected.indices.foreach(city1 => {
            isConnected(city1).indices.foreach{ city2 => 
                if (city1 != city2 && isConnected(city1)(city2) != 0)
                    union(city1, city2)
            }
        })
        provinces
    }
}