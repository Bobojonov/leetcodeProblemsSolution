class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt = 0, l = 0, total = 1;
        for (int r = 0; r < nums.length; r++) {
            total *= nums[r];
            while (l <= r && total >= k) {
                total /= nums[l++];
            }
            cnt += r - l + 1;
        }
        return cnt;
    }
}