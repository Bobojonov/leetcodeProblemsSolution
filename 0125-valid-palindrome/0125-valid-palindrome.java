class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                sb.append(Character.toLowerCase(c));
        }
        StringBuilder reversed = new StringBuilder(sb);
        return reversed.reverse().compareTo(sb) == 0;
    }
}