class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum = 0;
        int curr = 0;
        HashSet<Integer> set = new HashSet<>();
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            while (set.contains(nums[i])) {
                set.remove(nums[start]);
                curr -= nums[start];
                start++;
            } 
            curr += nums[i];
            set.add(nums[i]);
            sum = Math.max(sum, curr);
        }
        return sum;
    }
}