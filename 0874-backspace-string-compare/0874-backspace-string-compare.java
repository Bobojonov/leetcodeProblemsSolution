class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!s1.isEmpty())
                    s1.deleteCharAt(s1.length() - 1);
            } else
                s1.append(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!t1.isEmpty())
                    t1.deleteCharAt(t1.length() - 1);
            } else
                t1.append(t.charAt(i));
        }
        System.out.println(s1);
        System.out.println(t1);
        return s1.compareTo(t1) == 0;
    }
}