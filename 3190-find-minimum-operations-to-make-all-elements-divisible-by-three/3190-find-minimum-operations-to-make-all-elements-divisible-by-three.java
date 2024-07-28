class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int num: nums) {
            int reminder = num % 3;
            if (reminder != 0)
                count += Math.min(reminder, 3 - reminder);
        }
        return count;
    }

}