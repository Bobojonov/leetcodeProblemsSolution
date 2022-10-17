class Solution {
    public int singleNumber(int[] nums) {
        int seen_once = 0, seen_twice = 0;
        for (int num: nums) {
            seen_once = ~seen_twice & (seen_once ^ num);
            seen_twice = ~seen_once & (seen_twice ^ num);
        }
        return seen_once;
    }
}