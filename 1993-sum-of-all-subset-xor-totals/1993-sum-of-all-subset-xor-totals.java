class Solution {
    public int subsetXORSum(int[] nums) {
        return backtrack(0, nums,0);
    }
    
    public int backtrack(int i, int[] nums, int xor) {
        if (i == nums.length) return xor;
        int sumXor = backtrack(i + 1, nums, xor ^ nums[i]);
        int sum = backtrack(i + 1, nums, xor);
        return sumXor + sum;
    }
}