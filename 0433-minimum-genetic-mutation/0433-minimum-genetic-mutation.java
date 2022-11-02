class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Queue<String> queue = new LinkedList<>();
        Set<String> seen = new HashSet<>();
        queue.add(start);
        seen.add(start);
        int step = 0;
        char[] chars = {'A', 'C', 'G', 'T'};
        while (!queue.isEmpty()) {
            int nodes = queue.size();
            for (int i = 0; i < nodes; i++) {
                String node = queue.remove();
                if (node.equals(end))
                    return step;
                for (char c: chars) {
                    for (int j = 0; j < node.length(); j++) {
                        String next = node.substring(0, j) + c + node.substring(j + 1);
                        if (!seen.contains(next) && Arrays.asList(bank).contains(next)) {
                            queue.add(next);
                            seen.add(next);
                        }
                    }
                }
            }
            step++;

        }
        return -1;
    }
}