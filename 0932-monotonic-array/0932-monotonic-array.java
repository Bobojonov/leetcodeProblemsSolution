class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) return true;
        int id = 2;
        for (int i = 0; i < nums.length - 1; i++) {
            if (id == 2) {
                if (nums[i] < nums[i + 1]) id = 1;
                else if (nums[i] > nums[i + 1]) id = 0;
            }
            if (id == 1 && nums[i] > nums[i + 1]) return false;
            if (id == 0 && nums[i] < nums[i + 1]) return false;
        }
        return true;
    }
}