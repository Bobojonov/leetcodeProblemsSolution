class Solution {
    public int smallestRangeI(int[] nums, int k) {
        return Math.max(0, Arrays.stream(nums).max().getAsInt() - Arrays.stream(nums).min().getAsInt() - 2 * k);
    }
}