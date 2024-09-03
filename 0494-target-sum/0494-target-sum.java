class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        Map<String, Integer> map = new HashMap<>();
        return combinations(0, nums, target, map);
    }
     public static int combinations(int index, int[] nums, int target, Map<String, Integer> map) {
        if (index == nums.length) {
            return target == 0 ? 1 : 0;
        }
        String key = index + "," + target;
        if (map.containsKey(key))
            return map.get(key);
        int add = combinations(index + 1, nums, target + nums[index], map);
        int subtract = combinations(index + 1, nums, target - nums[index], map);
        map.put(key, add + subtract);
        return add + subtract;
    }
}