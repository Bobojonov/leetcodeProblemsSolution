class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num: nums) set.add(num);
        int longest = 1, currNum = 0, currLongest = 0;
        for (int num: nums) {
            if (!set.contains(num - 1)){
                currNum = num;
                currLongest = 0;
            }
            while (set.contains(currNum)) {
                currNum += 1;
                currLongest += 1;
            }
            longest = Math.max(currLongest, longest);
        }
        return longest;
    }
}