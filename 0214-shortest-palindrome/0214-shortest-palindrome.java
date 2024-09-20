class Solution {
    public String shortestPalindrome(String s) {
        int start = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == s.charAt(start)) start++;
        }
        if (start == s.length()) return s;
        String str = s.substring(start);
        return new StringBuilder(str).reverse() + shortestPalindrome(s.substring(0, start)) + str;
    }
}