class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder res = new StringBuilder();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int j = 1;

        for (String str : sentence.split("\\s")) {
            if (!res.isEmpty()) {
                res.append(' ');
            }

            if (vowels.contains(str.charAt(0))) {
                res.append(str).append("ma");
            } else {
                res.append(str.substring(1)).append(str.charAt(0)).append("ma");
            }

            res.append("a".repeat(j++));
        }

        return res.toString();
    }
}