class Solution {
    public int maxLength(List<String> arr) {
        return backtrack(arr, 0, new HashMap<Character, Integer>());
    }
    
    public int backtrack(List<String> arr, int idx, Map<Character, Integer> res) {
        for (Integer val: res.values()) {
            if (val > 1) return 0;
        }
        int maxLen = res.size();
        for (int i = idx; i < arr.size(); i++) {
            char[] word = arr.get(i).toCharArray();
            for (char c : word)
                res.put(c, res.getOrDefault(c, 0) + 1);
            maxLen = Math.max(maxLen, backtrack(arr, i + 1, res));
            for (char c: word) {
                if (res.get(c) == 1)
                    res.remove(c);
                else
                    res.put(c, res.get(c) - 1);
            }
        }
        return maxLen;
    }
}