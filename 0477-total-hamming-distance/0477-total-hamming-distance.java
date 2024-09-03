class Solution {
    public int totalHammingDistance(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                cnt += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return cnt;
    }
}