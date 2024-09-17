class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0, start = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while (map.get(nums[i]) > k) {
                map.put(nums[start], map.get(nums[start++]) - 1);
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}