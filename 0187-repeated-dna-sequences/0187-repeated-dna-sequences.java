class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> used = new HashSet<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i + 9 < s.length(); i++) {
            String sub = s.substring(i, i + 10);
            if (!used.add(sub))
                set.add(sub);
        }
        return new ArrayList<>(set);
    }
}