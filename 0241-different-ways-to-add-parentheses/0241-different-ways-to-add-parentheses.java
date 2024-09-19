class Solution {
   public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        boolean isNumber = true;
        for (int i = 0; i < expression.length(); i++) {
            if (!Character.isDigit(expression.charAt(i))) {
                isNumber = false;
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (int x: left) {
                    for (int y: right) {
                        int res = calc(x, y, expression.charAt(i));
                        result.add(res);
                    }
                }
            }
        }
        if (isNumber) result.add(Integer.parseInt(expression));
        return result;
    }
    
    public int calc(int x, int y, char operation) {
        if (operation == '+') return x + y;
        if (operation == '-') return x - y;
        if (operation == '*') return x * y;
        return 0;
    }
}