class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        StringBuilder reversed = new StringBuilder();
        int cnt = k;
        boolean isReversing = true;
        for (int i = 0; i < s.length(); i++) {
            if (cnt == 0) {
                if (isReversing) {
                    res.append(reversed.reverse());
                    reversed = new StringBuilder();
                    isReversing = false;
                } else {
                    isReversing = true;
                }
                cnt = k;
            }
            if (cnt > 0 && isReversing) {
                reversed.append(s.charAt(i));
                cnt--;
            }
            if (!isReversing && cnt > 0) {
                res.append(s.charAt(i));
                cnt--;
            }
        }
        return !reversed.isEmpty() ? res.append(reversed.reverse()).toString() : res.toString();
    }
}