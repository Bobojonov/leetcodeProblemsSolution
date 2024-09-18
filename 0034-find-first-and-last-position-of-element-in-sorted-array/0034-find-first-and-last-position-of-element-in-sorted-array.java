class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = -1, right = -1, l = 0, r = nums.length -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                left = mid;
                r = mid - 1;
            } else if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        l = 0; r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                right = mid;
                l = mid + 1;
            } else if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return new int[] {left, right};
    }
}