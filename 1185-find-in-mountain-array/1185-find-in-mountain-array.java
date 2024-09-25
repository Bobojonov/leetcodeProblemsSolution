/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l = 0, r = mountainArr.length() - 1, max = 0;
        while (l < r) {
            int mid = (l + r) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                l = mid + 1;
                max = mid + 1;
            } else r = mid;
        }
        l = 0; r = max;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (mountainArr.get(mid) == target) return mid;
            if (mountainArr.get(mid) > target) r = mid - 1;
            else l = mid + 1;
        }
        l = max; r = mountainArr.length() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (mountainArr.get(mid) == target) return mid;
            if (mountainArr.get(mid) > target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}