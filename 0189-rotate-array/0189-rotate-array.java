class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        rotateArray(0, nums.length - 1, nums);
        rotateArray(0, k - 1, nums);
        rotateArray(k, nums.length - 1, nums);
    }
    
    public void rotateArray(int l, int r, int[] nums) {
        while (l <= r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }
}