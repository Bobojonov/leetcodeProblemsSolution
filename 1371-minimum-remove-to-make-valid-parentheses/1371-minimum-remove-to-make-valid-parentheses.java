class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '(')
                stack.add(i);
            if (result.charAt(i) == ')') {
                if (!stack.isEmpty())
                    stack.pop();
                else
                    result.setCharAt(i, '.');
            }
        }
        while (!stack.isEmpty())
            result.setCharAt(stack.pop(), '.');
        return result.toString().replaceAll("\\.", "");
    }
}