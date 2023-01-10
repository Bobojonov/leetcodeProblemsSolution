class Solution {
    public int findMaximumXOR(int[] nums) {
        int max_num = nums[0];
        for (int num: nums) max_num = Math.max(max_num, num);
        int l = Integer.toBinaryString(max_num).length();
        int max_xor = 0, curr;
        Set<Integer> prefix = new HashSet<>();
        for (int i = l - 1; i > -1; i--) {
            max_xor <<= 1;
            curr = max_xor | 1;
            prefix.clear();
            for (int num: nums) prefix.add(num >> i);
            for (int pre: prefix) {
                if (prefix.contains(curr ^ pre)) {
                    max_xor = curr;
                    break;
                }
            }
        }
        return max_xor;
    }
}