class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int min = nums[n - 1], max = nums[0];
        int l = -1, r = -2;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, nums[n - 1 - i]);
            max = Math.max(max, nums[i]);
            if (max > nums[i]) r = i;
            if (min < nums[n - 1 - i]) l = n - 1 - i;
        }
        return r - l + 1;
    }
}