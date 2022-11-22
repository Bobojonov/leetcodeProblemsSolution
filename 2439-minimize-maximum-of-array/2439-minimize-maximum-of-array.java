class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum = nums[0];
        long max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = (sum + nums[i]);
            max = Math.max(max, (sum + i) / (i + 1));
        }
        return (int)max;
    }
}