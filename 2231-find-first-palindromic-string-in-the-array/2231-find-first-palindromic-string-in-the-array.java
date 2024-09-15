class Solution {
    public String firstPalindrome(String[] words) {
        for (String word: words) {
            StringBuilder sb = new StringBuilder(word);
            if (sb.reverse().toString().equals(word)) return word;
        }
        return "";
    }
}