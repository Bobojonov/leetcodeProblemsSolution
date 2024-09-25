class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[cnt]) {
                cnt++;
                nums[cnt] = nums[i];
            }
        }
        return cnt + 1;
    }
}