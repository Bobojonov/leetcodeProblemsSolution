class Solution {
    public int longestSubarray(int[] nums) {
       int l = 0, r, cnt = 1, res = 0;
        for (r = 0; r < nums.length; r++) {
            if (nums[r] == 0) cnt--;
            while(cnt < 0) {
                if (nums[l] == 0) cnt++;
                l++;
            }
            res = Math.max(res, r - l);
        }
        return res;
    }
}