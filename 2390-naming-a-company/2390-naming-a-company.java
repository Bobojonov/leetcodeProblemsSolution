class Solution {
    public long distinctNames(String[] ideas) {
       HashMap<Character, Set<String>> groups = new HashMap<>();
        for (String idea : ideas) {
            char c = idea.charAt(0);
            String sub = idea.substring(1);
            Set<String> set = groups.getOrDefault(c, new HashSet<>());
            set.add(sub);
            groups.put(c, set);
            groups.get(c).add(sub);
        }
        long res = 0;
        for (Character key1 : groups.keySet()) {
            Set<String> set1 = groups.get(key1);
            for (Character key2 : groups.keySet()) {
                if (key1 != key2) {
                    Set<String> set2 = groups.get(key2);
                    long cnt = 0;
                    for (String s : set1) {
                        if (set2.contains(s)) cnt++;
                    }
                    res += (set1.size() - cnt) * (set2.size() - cnt);
                }
            }
        }
        return res;
    
    }
}