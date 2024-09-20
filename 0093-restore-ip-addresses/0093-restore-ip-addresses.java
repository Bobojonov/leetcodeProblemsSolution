class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12)
            return res;
        backtrack(0, "", s, res);
        return res;
    }

    public void backtrack(int count, String restored, String s, List<String> res) {
        if (count == 4) {
            if (s.isEmpty())
                res.add(restored);
            return;
        }
        for (int i = 1; i <= Math.min(3, s.length()); i++) {
            String sec = s.substring(0, i);
            if ((sec.length() > 1 && sec.charAt(0) == '0') || (sec.length() == 3 && Integer.parseInt(sec) > 255))
                continue;
            backtrack(count + 1, restored + sec + (count < 3 ? "." : ""), s.substring(i), res);
        }
    }
}