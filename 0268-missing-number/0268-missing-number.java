class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, sum = (n + 1) * n / 2;
            for (int x: nums)
                sum -= x;
        return sum;   
    }
}