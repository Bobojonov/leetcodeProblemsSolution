class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> sMap = new HashMap<>(), pMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
        }
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            if (i >= p.length() - 1) {
                if (sMap.equals(pMap))
                    res.add(start);
                if (sMap.containsKey(s.charAt(start))) {
                    sMap.put(s.charAt(start), sMap.get(s.charAt(start)) - 1);
                    if (sMap.get(s.charAt(start)) == 0) 
                        sMap.remove(s.charAt(start));
                }
                start++;
            }
        }
        return res;
    }
}