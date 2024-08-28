class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxDifference = 0;
        for (int i = 0; i < nums.length - 1; i++)
            maxDifference = Math.max(maxDifference,nums[i + 1] - nums[i]);
        return maxDifference;
    }
}