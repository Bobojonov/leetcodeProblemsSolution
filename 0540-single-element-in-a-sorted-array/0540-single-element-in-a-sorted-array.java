class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != res) return res;
            res = nums[i + 1];
            i++;
        }
        return res;
    }
}