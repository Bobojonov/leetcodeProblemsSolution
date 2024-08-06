class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer str1 = new StringBuffer();
        for (String word: word1)
            str1.append(word);
        StringBuffer str2 = new StringBuffer();
        for (String word: word2)
            str2.append(word);
        return str1.compareTo(str2) == 0;
    }
    
}