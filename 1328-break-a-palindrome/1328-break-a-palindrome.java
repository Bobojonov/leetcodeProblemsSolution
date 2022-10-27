class Solution {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1) return "";
        int n = palindrome.length();
        char[] pal = palindrome.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            if (pal[i] != 'a') {
                pal[i] = 'a';
                return String.valueOf(pal);
            }
        }
        pal[n - 1] = 'b';
        return String.valueOf(pal);
        
    
    }
}