class Solution {
    public int countSegments(String s) {
        if (s.isEmpty()) return 0;
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') sb.append(s.charAt(i));
            else if (!sb.isEmpty()) {
                res.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return !sb.isEmpty() ? res.size() + 1 : res.size();
    }
}