class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] cnt = new boolean[nums.length + 1];
        int duplicated = -1, missing = -1;
        for (int num : nums) {
            if (cnt[num]) {
                duplicated = num;
            }
            cnt[num] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!cnt[i]) {
                missing = i;
                break;
            }
        }
        return new int[]{duplicated, missing};
    }
}