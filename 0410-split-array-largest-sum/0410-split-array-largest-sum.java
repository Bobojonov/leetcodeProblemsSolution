class Solution {
    public int splitArray(int[] nums, int k) {
        int total = 0, max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            total += num;
        }
        if (k == 1) return total;
        long l = max, r = total;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (go(nums, mid, k)) r = mid - 1;
            else l = mid + 1;
        }
        return (int) l;
    }

    public boolean go(int[] nums, long target, int k) {
        int cnt = 1;
        long total = 0;
        for (int num : nums) {
            total += num;
            if (total > target) {
                total = num;
                cnt++;
                if (cnt > k) return false;
            }
        }
        return true;
    }
}