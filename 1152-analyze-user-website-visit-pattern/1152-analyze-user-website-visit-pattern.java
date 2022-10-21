class Solution {
    
    public class Pair {
        int time;
        String web;
        
        Pair(int time, String web) {
            this.time = time;
            this.web = web;
        }
    }
    
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        Map<String, List<Pair>> map = new HashMap<>();
        int len = username.length;
        for (int i = 0; i < len; i++) {
            map.putIfAbsent(username[i], new ArrayList<>());
            map.get(username[i]).add(new Pair(timestamp[i], website[i]));
        }
        Map<String, Integer> cnt = new HashMap<>();
        String str = "";
        
        for (String key: map.keySet()) {
            Set<String> set = new HashSet<>();
            List<Pair> list = map.get(key);
            Collections.sort(list, (a, b) -> a.time - b.time);
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    for (int k = j + 1; k < list.size(); k++) {
                        String s = list.get(i).web + " " + list.get(j).web + " " + list.get(k).web;
                        if (!set.contains(s)) {
                            cnt.put(s, cnt.getOrDefault(s, 0) + 1);
                            set.add(s);
                        }
                        if (str.equals("") || cnt.get(str) < cnt.get(s) || cnt.get(str) == cnt.get(s) && str.compareTo(s) > 0)
                            str = s;
                    }
                }
            }
        }
        String[] s = str.split(" ");
        List<String> result = new ArrayList<>();
        for (String st: s)
            result.add(st);
        return result;
    }
}