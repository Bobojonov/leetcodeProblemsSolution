object Solution {
    def sortArrayByParity(nums: Array[Int]): Array[Int] = {
                nums.sortBy(x => x % 2 == 0).reverse

    }
}