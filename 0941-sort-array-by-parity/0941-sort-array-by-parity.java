class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0, r = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[l] = num;
                l++;
            } else {
                res[r] = num;
                r--;
            }
        }
        return res;
    }
}