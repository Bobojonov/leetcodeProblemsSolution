class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int cnt = 0;
        for (Map.Entry<Integer, Integer> x: map.entrySet()) {
            int value = x.getValue();
            if (value == 1) return -1;
            cnt += value / 3;
            if (value % 3 != 0) cnt++;
        }
        return cnt;
    }
}