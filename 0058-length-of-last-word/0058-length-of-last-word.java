class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!sb.isEmpty() && s.charAt(i) == ' ') break;
            if (Character.isLetter(s.charAt(i))) sb.append(s.charAt(i));
        }
        return sb.length();
    }
}