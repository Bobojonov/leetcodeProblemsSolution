class Solution {
    static class SortCharacters implements Comparable<SortCharacters> {
        Character c;
        Integer freq;
        public SortCharacters(Character c, Integer freq) {
            this.c = c;
            this.freq = freq;
        }

        @Override
        public int compareTo(SortCharacters o) {
            return o.freq.compareTo(this.freq);
        }
    }
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        List<SortCharacters> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            list.add(new SortCharacters(entry.getKey(), entry.getValue()));
        }
        Collections.sort(list);
       StringBuilder result = new StringBuilder();
        for (SortCharacters sc : list) {
            for (int i = 0; i < sc.freq; i++) {
                result.append(sc.c);
            }
        }

        return result.toString();
    }
}