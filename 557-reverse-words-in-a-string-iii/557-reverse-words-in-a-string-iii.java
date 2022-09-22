class Solution {
    public String reverseWords(String s) {
        String res = "";
        String temp = "";
        for (char ch: s.toCharArray()) {
            if (ch != ' ') temp = ch + temp;
            else {
                res = res + temp + " ";
                temp = "";
            }
        }
        return res + temp;
    }
}