class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: arr) 
            map.put(num, map.getOrDefault(num, 0) + 1);
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (set.contains(entry.getValue())) return false;
            set.add(entry.getValue());
        }
        return true;
    }
}