class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (st.isEmpty())
                st.push(ch);
            else {
                if (isAvailable(st.peek(), ch))
                    st.push(ch);
                else
                    st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append(st.pop());
        return sb.reverse().toString();
    }

    public boolean isAvailable(char a, char b) {
        if ((a < 'a' && b < 'a') || (a > 'Z' && b > 'Z'))
            return true;
        return Character.toLowerCase(a) != Character.toLowerCase(b);
    }
}