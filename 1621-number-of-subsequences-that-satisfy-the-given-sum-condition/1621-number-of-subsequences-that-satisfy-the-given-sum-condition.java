class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = (int) 1e9 + 7, n = nums.length;
        int l = 0, r = n - 1, cnt = 0;
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 1; i < n; i++)
            arr[i] = arr[i - 1] * 2 % mod;
        while (l <= r) {
            if (nums[l] + nums[r] > target) r--;
            else {
                cnt = (cnt + arr[r - l]) % mod;
                l++;
            }
        }
        return cnt;
    }
}