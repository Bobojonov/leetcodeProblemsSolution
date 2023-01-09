class Solution {
    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        int idx = -1;
        int min_diff = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1) || wordsDict[i].equals(word2)) {
                if (idx != -1 && (word1.equals(word2) || !wordsDict[idx].equals(wordsDict[i])))
                    min_diff = Math.min(min_diff, i - idx);
                idx = i;
            }
        }
        return min_diff;
    }
}