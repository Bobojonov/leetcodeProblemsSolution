class Solution {
    
    public class Node {
        String key;
        int value;
        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (String word: words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
            set.add(word);
        }
        
        PriorityQueue<Node> sorted = new PriorityQueue<>((a, b) -> a.value == b.value ? a.key.compareTo(b.key): b.value - a.value);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Node node = new Node(key, map.get(key));
            sorted.add(node);
        }
        List<String> result = new ArrayList<>();
        while (!sorted.isEmpty() && k --> 0) {
            Node node = sorted.poll();
            result.add(node.key);
        }
        return result;
    }
}