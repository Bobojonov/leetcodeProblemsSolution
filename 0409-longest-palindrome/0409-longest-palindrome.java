class Solution {
    public int longestPalindrome(String s) {
        if (s.isEmpty()) return 0;
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                res++;
            } else set.add(s.charAt(i));
        }
        if (!set.isEmpty()) return res * 2 + 1;
        return res * 2;
    }
}