class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) return res;
        Map<Integer, List<Character>> map = new HashMap<>();
        map.put(2, List.of('a', 'b', 'c'));
        map.put(3, List.of('d', 'e', 'f'));
        map.put(4, List.of('g', 'h', 'i'));
        map.put(5, List.of('j', 'k', 'l'));
        map.put(6, List.of('m', 'n', 'o'));
        map.put(7, List.of('p', 'q', 'r', 's'));
        map.put(8, List.of('t', 'u', 'v'));
        map.put(9, List.of('w', 'x', 'y', 'z'));
        backtrack(0, new StringBuilder(), digits, res, map);
        return res;
    }

    public void backtrack(int pos, StringBuilder sb, String digits, List<String> res, Map<Integer, List<Character>> map) {
        if (pos == digits.length()) {
            if (sb.length() == digits.length()) res.add(sb.toString());
            return;
        }
        for (int i = pos; i < digits.length(); i++) {
            List<Character> values = (map.get(digits.charAt(i) - '0'));
            for (Character value : values) {
                sb.append(value);
                backtrack(i + 1, sb, digits, res, map);
                sb.delete(sb.length() - 1, sb.length());
            }
        }
    }
}