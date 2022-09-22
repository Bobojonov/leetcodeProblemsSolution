class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> subset = new ArrayList<>();
        int maxNumberOfSubset = (int) Math.pow(2, len);
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < maxNumberOfSubset; i++) {
            List<Integer> currSubset = new ArrayList();
            StringBuilder hashcode = new StringBuilder();
            for (int j = 0; j < len; j++) {
                int mask = 1 << j;
                int isSet = mask & i;
                if (isSet != 0) {
                    currSubset.add(nums[j]);
                    hashcode.append(nums[j]).append(",");
                }
            }
            if (!seen.contains(hashcode.toString())) {
                seen.add(hashcode.toString());
                subset.add(currSubset);
            }
        }
        return subset;
    }
}