class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int num : nums) {
            count += Math.abs(num - findClosestDivisibleByThree(num));
        }
        return count;
    }
public static int findClosestDivisibleByThree(int num) {
        if (num % 3 == 0) return num;
        int lower = num - (num % 3);
        int higher = lower + 3;
        if (num - lower < higher - num)
            return lower;
        else return higher;
    }
}