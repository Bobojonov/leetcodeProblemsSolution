class Solution {
    public int findLonelyPixel(char[][] picture) {
        int r = picture.length;
        int c = picture[0].length;
        int result = 0;
        for (int i = 0; i < c; i++)
            result += check(picture, 0, i) ? 1 : 0;

        for (int i = 1; i < r; i++)
            result += check(picture, i, 0) ? 1 : 0;

        for (int i = 0; i < c; i++)
            picture[0][i]= (picture[0][i] == 'B' ? '1' : '0');

        for (int i = 0; i < r; i++)
            picture[i][0] = (picture[i][0] == 'B' ? '1' : '0');

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (picture[i][j] == 'B') {
                    picture[i][0]++;
                    picture[0][j]++;
                }
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
               if (picture[i][j] == 'B') {
                    if (picture[i][0] == '1' && picture[0][j] == '1')
                        result++;
                }
            }
        }
        return result;
    }
      public static boolean check(char[][] picture, int r, int c) {
        int row = picture.length;
        int col = picture[0].length;
        int count = 0;
        for (int i = 0; i < row; i++)
            count += (picture[i][c] == 'B' ? 1: 0);
        for (int i = 0; i < col; i++) {
            if (i != c) count += (picture[r][i] == 'B' ? 1: 0);
        }
        return picture[r][c] == 'B' && count == 1;
    }
}