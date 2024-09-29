class Solution {
    public int jump(int[] nums) {
        int jumps = 0, max = 0, curr = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == curr) {
                curr = max;
                jumps++;
            }
        }
        return jumps;
    }
}