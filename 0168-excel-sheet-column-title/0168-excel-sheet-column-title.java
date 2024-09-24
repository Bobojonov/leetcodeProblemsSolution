class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (columnNumber > 0) {
            sb.append(s.charAt((columnNumber - 1) % 26));
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
}