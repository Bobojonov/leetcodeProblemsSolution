class Solution {
    public void sortColors(int[] nums) {
        int l = 0, mid = 0, r = nums.length - 1;
        while (mid <= r) {
            if (nums[mid] == 0) {
                int tmp = nums[l];
                nums[l] = nums[mid];
                nums[mid] = tmp;
                l++;
                mid++;
            } else if (nums[mid] == 1) mid++;
            else {
                int tmp = nums[r];
                nums[r] = nums[mid];
                nums[mid] = tmp;
                r--;
            }
        }
    }
}