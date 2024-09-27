class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res = 1, cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) cnt++;
            else {
                res = Math.max(res, cnt);
                cnt = 1;
            }
        }
        return Math.max(res, cnt);
    }
}