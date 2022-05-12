object Solution {
    def checkIfExist(arr: Array[Int]): Boolean = {
        if (arr.filter(_ == 0).length > 1) true
        else arr.sorted.map(x => arr.find(y => x != 0 && x % 2 == 0 && y == x / 2)).flatten.length > 0
    }
}