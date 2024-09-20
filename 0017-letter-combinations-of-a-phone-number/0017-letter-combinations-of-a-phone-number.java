class Solution {
   public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) return res;
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(0, new StringBuilder(), digits, res, map);
        return res;
    }

    public void backtrack(int pos, StringBuilder sb, String digits, List<String> res, Map<Character, String> map) {
        if (pos == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String values = map.get(digits.charAt(pos));
        for (int i = 0; i < values.length(); i++) {
            sb.append(values.charAt(i));
            backtrack(pos + 1, sb, digits, res, map);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}