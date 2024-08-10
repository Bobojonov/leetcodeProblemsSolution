class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        for (int i = 1; i < travel.length; i++) {
            travel[i] = travel[i - 1] + travel[i]; 
        }
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < garbage.length; i++) {
            for (int j = 0; j < garbage[i].length(); j++) {
                map.put(garbage[i].charAt(j), i);
            }
            res += garbage[i].length();
        }
        String garbageTypes = "MPG";
        for (char c : garbageTypes.toCharArray()) {
            res += (map.getOrDefault(c, 0) == 0 ? 0 : travel[map.get(c) - 1]);
        }

        return res;
    }
}