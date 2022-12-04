class Solution {
    public int minimumAverageDifference(int[] nums) {
        int idx =-1, min = Integer.MAX_VALUE;
        int n = nums.length;
        long prefix = 0, total = 0;
        for (int i = 0; i < n; i++)
            total += nums[i];
        for (int i = 0; i < n; i++) {
            prefix += nums[i];
            long leftAverage = prefix;
            leftAverage /= (i + 1);
            long rightAverage = total - prefix;
            if (i != n - 1)
                rightAverage /= (n - i - 1);
            
            int diff = (int)Math.abs(leftAverage - rightAverage);
            if (diff < min) {
                min = diff;
                idx = i;
            }
        }
        return idx;
    }
}