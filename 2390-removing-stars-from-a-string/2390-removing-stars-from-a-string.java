class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '*') {
                if (!st.isEmpty()) st.pop();
                else continue;
            } else st.add(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}