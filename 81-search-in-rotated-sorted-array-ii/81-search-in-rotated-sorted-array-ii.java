class Solution {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        int l = 0, r = nums.length - 1;
        while (l <= r && nums[l] == nums[r]) {
                if (nums[l] == target) return true;
            l++;
            r--;
        }
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return true;
            if (nums[mid] >= nums[l]) {
                if (target >= nums[l] && target < nums[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            } else {
                if (target <= nums[r] && target > nums[mid])
                    l = mid + 1;
                else 
                    r = mid - 1;
            }
        }
        return false;
    }
}