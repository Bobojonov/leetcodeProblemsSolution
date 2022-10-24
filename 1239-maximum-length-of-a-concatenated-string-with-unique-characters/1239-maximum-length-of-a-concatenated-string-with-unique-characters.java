class Solution {
    public int maxLength(List<String> arr) {
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int max = 0;
        for (String word: arr)
            max = Math.max(max, masks(word, set));
        return max;
    }
    
    public int masks(String arr, Set<Integer> set) {
        int bitSet = 0;
        int len = 0;
        for (char c: arr.toCharArray()) {
            int mask = 1 << c - 'a';
            if ((bitSet & mask) > 0) return 0;
            bitSet += mask;
        }
        if (set.contains(bitSet))
            return 0;
        Set <Integer> newSet = new HashSet<>();
        for (Integer st: set) {
            if ((st & bitSet) > 0) continue;
            int newLen = (st >> 26) + arr.length();
            int newBitSet = (bitSet + st) & ((1 << 26) - 1);
            newSet.add((newLen << 26) + newBitSet);
            len = Math.max(len, newLen);
        }
        set.addAll(newSet);
        return len;
    }
}