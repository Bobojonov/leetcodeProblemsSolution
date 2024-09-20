class Solution {
    static class Pair {
        public Character ch;
        int count;

        public Pair(Character ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> Integer.compare(y.count, x.count));
        if (a > 0) pq.add(new Pair('a', a));
        if (b > 0) pq.add(new Pair('b', b));
        if (c > 0) pq.add(new Pair('c', c));
        StringBuilder res = new StringBuilder();
        while (pq.size() > 1) {
            Pair pair1 = pq.poll();
            if (pair1.count >= 2) {
                res.append(pair1.ch);
                res.append(pair1.ch);
                pair1.count -= 2;
            } else {
                res.append(pair1.ch);
                pair1.count -= 1;
            }
            Pair pair2 = pq.poll();
            if (pair2.count >= 2 && pair1.count < pair2.count) {
                res.append(pair2.ch);
                res.append(pair2.ch);
                pair2.count -= 2;
            } else {
                res.append(pair2.ch);
                pair2.count -= 1;
            }
            if (pair1.count > 0)
                pq.add(pair1);
            if (pair2.count > 0)
                pq.add(pair2);
        }
        if (!pq.isEmpty()) {
            if (res.isEmpty() || res.charAt(res.length() - 1) != pq.peek().ch) {
                if (pq.peek().count >= 2) {
                    res.append(pq.peek().ch);
                    res.append(pq.peek().ch);
                } else res.append(pq.peek().ch);
            }
        }
        return res.toString();
    }
}