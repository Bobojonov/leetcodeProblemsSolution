class Solution {
    public int longestStrChain(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.sort(words, (a , b) -> a.length() - b.length());
        for (String word: words)
            map.put(word, word.length());
        int longestSequence = 1;
        for (String word: words) {
            int currLen = 1;
            for (int i = 0; i < word.length(); i++) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                currLen = Math.max(currLen, map.getOrDefault(prev, 0) + 1);
            }
            map.put(word, currLen);
            longestSequence = Math.max(longestSequence, currLen);
        }
        return longestSequence;
    }
}