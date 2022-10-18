class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    public void backtrack(List<String> res, String str, int open, int close, int len) {
        if (str.length() == len * 2) {
            res.add(str);
            return;
        }
        if (open < len)   backtrack(res, str + "(", open + 1, close, len);
        if (close < open) backtrack(res, str + ")", open, close + 1, len);
    }
}