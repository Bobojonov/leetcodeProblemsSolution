class Solution {
    public String pushDominoes(String dominoes) {
        int len = dominoes.length();
        char[] dominoe = dominoes.toCharArray();
        char start = '.', end = '.';
        int i = 0;
        while (i < len) {
            int startIdx = i;
            while (i < len && dominoe[i] == '.') i++;
            if (i < len) end = dominoe[i];
            if (i - startIdx > 0) {
                if (start == 'R' && end == 'L') {
                    int left = startIdx;
                    int right = i - 1;
                    while (left < right){
                        dominoe[left] = 'R';
                        dominoe[right] = 'L';
                        left++;
                        right--;
                    }
                }
                else if (end == 'L') {
                    int left = i - 1;
                    while (left >= startIdx){
                        dominoe[left] = 'L';
                        left--;
                    }
                }
                else if (start == 'R') {
                    int right = startIdx;
                    while (right < i){
                        dominoe[right] = 'R';
                        right++;
                    }
                }
            }
            start = end;
            i++;
            end = '.';
        }
        return new String(dominoe);
    
    }
}