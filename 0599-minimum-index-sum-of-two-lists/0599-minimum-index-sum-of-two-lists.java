class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> common = new HashMap<>();
        for (int i = 0; i < list1.length; i++) if (!map.containsKey(list1[i])) map.put(list1[i], i);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int sum = map.get(list2[i]) + i;
                if (sum <= min) {
                    min = sum;
                    common.put(list2[i], sum);
                }
            }
        }
        for (Map.Entry<String, Integer> entry: common.entrySet()) {
            if (entry.getValue() == min) res.add(entry.getKey());
        }
        return res.toArray(new String[0]);
    }
}