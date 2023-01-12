class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
        int n = nums.length;
        if (n <= 1) return 0;
        if (n == 2) return nums[1] - nums[0];
        int l = n / 2, r = -1;
        if (n % 2 == 0) r = l - 1;
        int total1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < l) total1 += nums[l] - nums[i];
            if (i > l) total1 += nums[i] - nums[l];
        }
        int total2 = 0;
        if (r != -1) {
            for (int i = 0; i < nums.length; i++) {
                if (i < r) total2 += nums[r] - nums[i];
                if (i > r) total2 += nums[i] - nums[r];
            }
            return Math.min(total1, total2);
        }
        return total1;
    }
}