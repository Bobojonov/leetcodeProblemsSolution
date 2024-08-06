class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int maxValue = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            if (map.get(num) > maxValue)
                maxValue = map.get(num);
        }
        for (int i = 0; i < maxValue; i++) {
            List<Integer> curr = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (value > 0) {
                    curr.add(key);
                    map.put(key, value - 1);
                }
            }
            if (!curr.isEmpty()) result.add(curr);
        }
        return result;
    }
}