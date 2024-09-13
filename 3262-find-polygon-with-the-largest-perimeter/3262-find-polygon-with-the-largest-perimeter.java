class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for (int num: nums) sum += num;
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            sum -= nums[i];
            if (sum > nums[i])
                return sum + nums[i];
        }
        return -1;
    }
}