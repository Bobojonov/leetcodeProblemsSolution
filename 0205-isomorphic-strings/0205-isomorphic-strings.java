class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[150];
        int[] indexT = new int[150];
        for (int i = 0; i < s.length(); i++) {
            if (indexS[s.charAt(i)] != indexT[t.charAt(i)]) return false;
            indexT[t.charAt(i)] = i + 1;
            indexS[s.charAt(i)] = i + 1;
        }
        return true;
    }
}