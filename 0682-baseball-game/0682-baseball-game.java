class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String operation : operations) {
            if (Character.isDigit(operation.charAt(operation.length() - 1))) st.push(Integer.parseInt(operation));
            else if (operation.startsWith("C")) {
                st.pop();
            } else if (operation.startsWith("D")) {
                int x = st.peek();
                st.push(x * 2);
            } else {
                int x = st.pop();
                if (!st.isEmpty()) {
                    int y = st.pop();
                    st.push(y);
                    st.push(x);
                    st.push(x + y);
                } else {
                    st.push(x);
                    st.push(x);
                }
            }
            System.out.println(st);
        }
        int res = 0;
        while (!st.isEmpty()) {
            res += st.pop();
        }
        return res;
    }
}