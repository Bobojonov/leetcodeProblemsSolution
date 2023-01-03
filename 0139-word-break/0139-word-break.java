class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] a = new boolean[s.length() + 1];
        a[0] = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i]) {
                for (int j = i + 1; j < a.length; j++) {
                    if (set.contains(s.substring(i, j))) a[j] = true;
                }
            }
            if (a[a.length - 1]) return true;
        }
        return false;
    }
}