class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        for (String word: word1)
            s1.append(word);
        StringBuilder s2 = new StringBuilder();
        for (String word: word2)
            s2.append(word);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        return s1.toString().equals(s2.toString());
    }
}