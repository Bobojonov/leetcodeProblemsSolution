class Solution {
    public long countSubarrays(int[] nums, int k) {
        int a = Arrays.stream(nums).max().getAsInt();
        long res = 0;
        int start = 0, curr = 0;
        for (int num : nums) {
            curr += num == a ? 1 : 0;
            while (curr >= k) {
                curr -= nums[start++] == a ? 1 : 0;
            }
            res += start;
        }
        return res;
    }
}