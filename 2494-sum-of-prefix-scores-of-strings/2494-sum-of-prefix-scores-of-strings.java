class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        int[] res = new int[words.length];
        int cnt = 0;
        for (String word: words) {
            Trie x = trie;
            for (int i = 0; i < word.length(); i++) {
                int c = word.charAt(i) - 'a';
                if (x.chars[c] == null) x.chars[c] = new Trie();
                x.chars[c].visited++;
                x = x.chars[c];
            }
        }
        for (String word: words) {
            Trie x = trie;
            int curr = 0;
            for (int i = 0; i < word.length(); i++) {
                int c = word.charAt(i) - 'a';
                curr += x.chars[c].visited;
                x = x.chars[c];
            }
            res[cnt++] = curr;
        }
        return res;
    }
    
    static class Trie {
        Trie[] chars = new Trie[26];
        int visited = 0;
    }
}