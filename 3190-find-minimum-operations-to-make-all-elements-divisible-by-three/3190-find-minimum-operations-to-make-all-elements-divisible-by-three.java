class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int remainder = nums[i] % 3;
            if (remainder != 0) {
                int adjustment = Math.min(remainder, 3 - remainder);
                count += adjustment;
                nums[i] += (remainder == 1) ? -1 : 1;
            }
        }
        return count;
    }

}