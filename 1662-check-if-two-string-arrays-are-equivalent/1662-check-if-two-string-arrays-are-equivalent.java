class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        for (String word: word1)
            str1 += word;
        String str2 = "";
        for (String word: word2)
            str2 += word;
        System.out.println(str1 + " " + str2);
        return str1.equals(str2);
    }
    
}