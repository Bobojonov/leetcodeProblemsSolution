class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int i = 0, j = 0, sum = 0, len = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j++];
            while (sum >= target) {
                len = Math.min(len, j - i);
                sum -= nums[i++];
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}