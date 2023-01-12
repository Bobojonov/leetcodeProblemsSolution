class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return dfs(0, nums.length - 1, 1, nums) >= 0;
    }
    int dfs(int i, int j, int total, int[] nums) {
        if (i == j) return total * nums[i];
        int p1 = total * nums[i] + dfs(i + 1, j, -total, nums);
        int p2 = total * nums[j] + dfs(i, j - 1, -total, nums);
        return total * Math.max(total * p1, total * p2);
    }
}