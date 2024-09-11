class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i <= nums.length; i++) {
            map.put(i, false);
        }
        for (int num : nums) {
            map.put(num, true);
        }
        for (Map.Entry<Integer, Boolean> mp: map.entrySet()) {
            if (!mp.getValue()) result.add(mp.getKey());
        }
        return result;
    }
}