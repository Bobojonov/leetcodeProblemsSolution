class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int left_sum = 0;
        for (int i: nums) sum += i;
        for (int i = 0; i < nums.length; i++){
            if (left_sum == sum - left_sum - nums[i]) return i;
            else left_sum = left_sum + nums[i];
        }
        return -1;
    }
}