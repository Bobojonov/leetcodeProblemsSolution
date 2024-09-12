class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[] domino = dominoes.toCharArray();
        char start = '.', end = '.';
        int i = 0;
        while (i < n) {
            int idx = i;
            while (i < n && domino[i] == '.') i++;
            if (i < n) end = domino[i];
            if (i > idx) {
                if (start == 'R' && end == 'L') {
                    int left = idx;
                    int right = i - 1;
                    while (left < right) {
                        domino[left++] = 'R';
                        domino[right--] = 'L';
                    }
                }
                else if (end == 'L') {
                    int right = i - 1;
                    while (right >= idx) domino[right--] = 'L';
                } else if (start == 'R') {
                    int left = idx;
                    while (left < i) domino[left++] = 'R';
                }
            }
            start = end;
            i++;
            end = '.';
        }
        StringBuilder sb = new StringBuilder();
        for (char c: domino)
            sb.append(c);
        return sb.toString();
    }
}