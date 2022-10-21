class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c = image[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = c - 1; j >= 0; j--) {
                res[i][c - j - 1] = image[i][j];
            }
        }
         for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(res[i][j] +  " ");
            }
            System.out.println();
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (res[i][j] == 0) res[i][j] = 1;
                else res[i][j] = 0;
            }
        }
        return res;
    }
}