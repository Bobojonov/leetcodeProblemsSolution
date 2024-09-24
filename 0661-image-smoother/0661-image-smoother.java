class Solution {
    public int[][] imageSmoother(int[][] img) {
        int r = img.length, c = img[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int avg = 0, cnt = 0;
                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        int dx = i + x;
                        int dy = j + y;
                        if (dx < 0 || dx >= r || dy < 0 || dy >= c) continue;
                        avg += img[dx][dy];
                        cnt++;
                    }
                }
                res[i][j] = avg / cnt;
            }
        }
        return res;
    }
}