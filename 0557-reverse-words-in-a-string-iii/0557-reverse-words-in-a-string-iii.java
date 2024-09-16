class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        int len = split.length - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length - 1; i++) {
            sb.append(new StringBuilder(split[i]).reverse()).append(" ");
        }
        sb.append(new StringBuilder(split[len]).reverse());
        return sb.toString();
    }
}