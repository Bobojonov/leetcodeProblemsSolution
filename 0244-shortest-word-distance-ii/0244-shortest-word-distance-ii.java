class WordDistance {

    HashMap<String, ArrayList<Integer>> locations;

        public WordDistance(String[] strings) {
            this.locations = new HashMap<String, ArrayList<Integer>>();
            for (int i = 0; i < strings.length; i++) {
                ArrayList<Integer> location = this.locations.getOrDefault(strings[i], new ArrayList<>());
                location.add(i);
                this.locations.put(strings[i], location);
            }
        }

    public int shortest(String word1, String word2) {
        ArrayList<Integer> location1, location2;
        location1 = this.locations.get(word1);
        location2 = this.locations.get(word2);
        int l1 = 0, l2 = 0, min_diff = Integer.MAX_VALUE;
        while (l1 < location1.size() && l2 < location2.size()) {
            min_diff = Math.min(min_diff, Math.abs(location1.get(l1) - location2.get(l2)));
            if (location1.get(l1) < location2.get(l2)) l1++;
            else l2++;
        }
        return min_diff;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(wordsDict);
 * int param_1 = obj.shortest(word1,word2);
 */