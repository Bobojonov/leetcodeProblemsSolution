class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0, idx = 0;
        for (int n: nums) {
            if (n == 0) {
                result += ++idx;
            } else idx = 0;
        }
        return result;
    }
}