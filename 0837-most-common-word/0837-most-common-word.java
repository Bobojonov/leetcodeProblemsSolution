class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
        for (String w : words) if (!ban.contains(w)) map.put(w, map.getOrDefault(w, 0) + 1);
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}