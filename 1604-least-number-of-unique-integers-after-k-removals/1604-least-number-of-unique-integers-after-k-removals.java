class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: arr) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());
        while (k > 0)  k -= pq.poll();
        return k < 0 ? pq.size() + 1 : pq.size();
    }
}