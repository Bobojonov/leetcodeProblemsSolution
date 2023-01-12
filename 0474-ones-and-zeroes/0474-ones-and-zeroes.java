class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] arr = new int[m + 1][n + 1];
        for (int i = 0; i < strs.length; i++) {
            int[] count = countZerosOnes(strs[i]);
            for (int z = m; z >= count[0]; z--) {
                for (int one = n; one >= count[1]; one--) {
                    arr[z][one] = Math.max(arr[z][one],1 + arr[z - count[0]][one - count[1]]);
                }
            }
        }
        return arr[m][n];
    }
    int[] countZerosOnes(String s) {
        int[] count = new int[2];
        for (char c: s.toCharArray())
            count[c - '0']++;
        return count;
    }
}