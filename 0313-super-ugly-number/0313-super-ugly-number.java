class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int j : primes) pq.offer(new int[]{j, j, 0});
        int[] res = new int[n+1];
        int i = 1;
        res[0] = 1;
        while (i < n) {
            int[] duplicates = pq.poll();
            assert duplicates != null;
            int num = duplicates[0], prime = duplicates[1], idx = duplicates[2];
            if (num != res[i - 1]) {
                res[i] = num;
                i++;
            }
            pq.offer(new int[]{prime * res[idx + 1], prime, idx + 1});
        }
        return res[n - 1];
    }
}