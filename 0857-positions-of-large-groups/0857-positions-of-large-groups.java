class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int start = 0, n = s.length();
        for (int i = 0; i <= n; i++) {
            if (i == n || s.charAt(i) != s.charAt(start)) {
                int group_length = i - start;
                if (group_length >= 3) {
                    List<Integer> interval = new ArrayList<>();
                    interval.add(start);
                    interval.add(i - 1);
                    res.add(interval);
                }
                start = i;
            }
        }
        return res;
    }
}