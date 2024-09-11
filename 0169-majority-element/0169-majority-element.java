class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int num: nums) 
            map.put(num, map.getOrDefault(num, 0) + 1);
        for (Map.Entry<Integer, Integer> mp: map.entrySet()) {
            int value = mp.getValue();
            if ((double)value >= n * 1.0 / 2) return mp.getKey();
        }
        return 0;
    }
}