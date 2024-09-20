class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int xor = 0;
        for (int num: nums) xor ^= num;
        xor &= -xor;
        for (int num: nums) {
            if ((num & xor) == 0) res[0] ^= num;
            else res[1] ^= num;
        }
        return res;
    }
}