class Solution {
    public String alphabetBoardPath(String target) {
        int x = 0, y = 0;
        StringBuilder sb = new StringBuilder();
        for (char c: target.toCharArray()) {
            int x1 = (c - 'a') % 5, y1 = (c - 'a') / 5;
            while (y1 < y) { y--; sb.append('U'); }
            while (x1 > x) { x++; sb.append('R'); }
            while (x1 < x) { x--; sb.append('L'); }
            while (y1 > y) { y++; sb.append('D'); }
            sb.append('!');
        }
        return sb.toString();
    }
}