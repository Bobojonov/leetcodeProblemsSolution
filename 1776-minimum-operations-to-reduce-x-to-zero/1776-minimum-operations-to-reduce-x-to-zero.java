class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0, res = -1, curr = 0;
        for (int num: nums) total += num;
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            while (r <= i && curr > total - x) curr -= nums[r++];
            if (curr == total - x) res = Math.max(res, i - r + 1);
        }
        return res == -1 ? -1 : nums.length - res;
    }
}