class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[2 * n];
        System.arraycopy(nums, 0, res, 0, n);
        if (2 * n - n >= 0) System.arraycopy(nums, 0, res, n, 2 * n - n);
        return res;
    }
}