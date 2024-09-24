class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) nums[cnt++] = nums[i];
        }
        int res = nums.length;
        for (int i = 0, j = 0; i < cnt; i++) {
            while (j < cnt && nums[j] - nums[i] <= nums.length - 1) j++;
            res = Math.min(res, nums.length - (j - i));
        }
        return res;
    }
}