class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = leftIndex(nums, target);
        if (left == -1) return new int[] {-1, -1};
        int right = rightIndex(nums, target);
        return new int[] {left, right};
    }
    
    public int leftIndex(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int left = -1;
        while (l <= r) {
            int mid = r - (r - l) / 2;
            if (nums[mid] == target) {
                left = mid;
                r = mid - 1;
            }
            else if (nums[mid] < target)
                l = mid + 1;
            else 
                r = mid - 1;
        }
        return left;
    }
    public int rightIndex(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int right = -1;
        while (l <= r) {
            int mid = r - (r - l) / 2;
            if (nums[mid] == target) {
                right = mid;
                l = mid + 1;
            }
            else if (nums[mid] < target)
                l = mid + 1;
            else 
                r = mid - 1;
        }
        return right;
    }
}