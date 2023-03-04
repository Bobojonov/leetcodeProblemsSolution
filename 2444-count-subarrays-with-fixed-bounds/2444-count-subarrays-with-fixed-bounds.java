class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long min = -1, max = -1, left = -1, res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) left = i;
            if (nums[i] == minK) min = i;
            if (nums[i] == maxK) max = i;
            res += Math.max(0L, Math.min(min, max) - left);
        }
        return res;
    }
}