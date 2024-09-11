class Solution {
    public String largestGoodInteger(String num) {
        String[] patterns = new String[]{"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for (String s : patterns) {
            if (num.indexOf(s) != -1)
                return num.substring(num.indexOf(s), num.indexOf(s) + 3);
        }
        return "";
    }
}