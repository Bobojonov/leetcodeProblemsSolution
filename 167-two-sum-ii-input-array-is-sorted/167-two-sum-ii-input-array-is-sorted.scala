object Solution {
    def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
        def twoPointer(i: Int, j: Int): Array[Int] = {
      if (i < j) {
        if (numbers(i) + numbers(j) == target) Array(i + 1, j + 1)
        else if (numbers(i) + numbers(j) > target) twoPointer(i, j - 1)
        else twoPointer(i + 1, j)
      } else Array()
    }
    twoPointer(0, numbers.length - 1)
    }
}