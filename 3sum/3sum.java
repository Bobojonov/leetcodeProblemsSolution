class Solution {
   public List<List<Integer>> threeSum(int[] nums) {
       Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j <= nums.length - 1; j++) {
                int sum = -nums[j] - nums[i];
                if (map.containsKey(sum)){
                    List<Integer> list = Arrays.asList(nums[i], nums[j], sum);
                    Collections.sort(list);
                    set.add(list);

                }
                map.put(nums[j], i);
            }
        }
        return new ArrayList<>(set);
    }
    
}