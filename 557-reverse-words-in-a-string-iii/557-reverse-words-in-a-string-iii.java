class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (ch != ' ') temp.append(ch);
            else {
                res.append(temp.reverse() + " ");
                temp = new StringBuilder();
            }
        }
        return res.append(temp.reverse()).toString();
    }
}