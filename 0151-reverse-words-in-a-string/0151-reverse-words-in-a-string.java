class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> list = new ArrayList<>(Arrays.asList(s.split("\\s+")));
        Collections.reverse(list);
        return String.join(" ", list);
    }
}