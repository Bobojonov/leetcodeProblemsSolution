class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null || score.length == 0)
            return 0;
        int[] chars  = new int[26];
        for (char c: letters)
            chars[c - 'a']++;
        return backtrack(0, chars, words, score);
    }
    
    public static int backtrack(int start, int[] chars, String[] words, int[] score) {
        int max = 0;
        for (int i = start; i < words.length; i++) {
            int res = 0;
            boolean valid = true;
            for (char c: words[i].toCharArray()) {
                chars[c - 'a']--;
                res += score[c - 'a'];
                if (chars[c - 'a'] < 0) valid = false;
            }
            if (valid) {
                res += backtrack(i + 1, chars, words, score);
                max = Math.max(max, res);
            }
            for (char c: words[i].toCharArray()) {
                chars[c - 'a']++;
                res = 0;
            }
        }
        return max;
    }
}