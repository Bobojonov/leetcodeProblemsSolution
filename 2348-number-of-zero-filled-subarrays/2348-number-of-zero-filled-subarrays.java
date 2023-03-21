class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long total = 0, curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                curr++;
            else {
                total += (curr + 1) * curr / 2;
                curr = 0;
            }

        }
        return total + (curr + 1) * curr / 2;
    }
}