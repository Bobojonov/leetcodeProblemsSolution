class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l = 0, n = nums.length, r = nums[n - 1] - nums[0];
        while (l < r) {
            int mid = l + (r - l) / 2, k = 0;
            for (int i = 1; i < n && k < p; i++) {
                if (nums[i] - nums[i - 1] <= mid) {
                    k++;
                    i++;
                }
            }
            if (k >= p) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}