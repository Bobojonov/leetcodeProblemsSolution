class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        backtracking(0, new ArrayList<>(), result,  s);
        return result;
    }
    
    public static void backtracking(int start, List<String> comb, List<List<String>> result, String s) {
        if (s.length() <= start) result.add(new ArrayList<>(comb));
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(start, i, s)) {
                comb.add(s.substring(start, i + 1));
                backtracking(i + 1, comb, result, s);
                comb.remove(comb.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(int l, int r, String s) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}