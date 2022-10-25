class Solution {
    public List<String> removeComments(String[] source) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean f = false;
        for (String s: source) {
            for (int i = 0; i < s.length(); i++) {
                if (f) {
                    if (i < s.length() - 1 && s.charAt(i) == '*' && s.charAt(i + 1) == '/') {
                        f = false;
                        i++;
                    }
                }
                else {
                    if (i < s.length() - 1 && s.charAt(i) == '/' && s.charAt(i + 1) == '/')
                        break;
                    else if (i < s.length() - 1 && s.charAt(i) == '/' && s.charAt(i + 1) == '*') {
                        f = true;
                        i++;
                    }
                    else sb.append(s.charAt(i));
                }
            }
            if (!f && sb.length() > 0) {
                result.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return result;
    }
}