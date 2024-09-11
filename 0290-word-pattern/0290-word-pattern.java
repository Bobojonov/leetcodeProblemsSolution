class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> map1 = new HashMap<>();
        HashMap<Character, String> map2 = new HashMap<>();
        String[] split = s.split(" ");
        if (split.length != pattern.length()) return false;
        for (int i = 0; i < split.length; i++) {
            if (!map1.containsKey(split[i])) map1.put(split[i], pattern.charAt(i));
            if (!map2.containsKey(pattern.charAt(i)) && map1.get(split[i]) == pattern.charAt(i))
                map2.put(pattern.charAt(i), split[i]);
            if (!Objects.equals(split[i], map2.get(pattern.charAt(i)))) return false;
        }
        return true;
    }
}