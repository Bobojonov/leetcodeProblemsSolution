class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] list1 = s1.split(" ");
        String[] list2 = s2.split(" ");
        for (String list: list1) map.put(list, map.getOrDefault(list, 0) + 1);
        for (String list: list2) map.put(list, map.getOrDefault(list, 0) + 1);
        List<String> sb = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) sb.add(entry.getKey());
        }
        String[] res = new String[sb.size()];
        for (int i = 0; i < sb.size(); i++) {
            res[i] = sb.get(i);
        }
        return res;
    }
}