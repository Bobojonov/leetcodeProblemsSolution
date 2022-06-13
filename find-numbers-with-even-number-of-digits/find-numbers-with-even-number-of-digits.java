class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i ++){
            if ((String.valueOf(nums[i]).length() & 1) == 0) count += 1;
        }
        return count;
    }
}