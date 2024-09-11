class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length, total = 0;
        for (int num: nums) total += num;
        int left_sum = 0;
        for (int i = 0; i < n; i++) {
            int right_sum = total - left_sum - nums[i];
            if (left_sum == right_sum) return i;
            left_sum += nums[i];
        }
        return -1;
    }
}