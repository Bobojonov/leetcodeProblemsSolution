class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) count += nums.get(i);
        }
        return count;
    }
}