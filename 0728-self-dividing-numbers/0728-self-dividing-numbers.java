class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i < 10) res.add(i);
            else {
                String s = String.valueOf(i);
                if (s.contains("0")) continue;
                boolean f = true;
                int x = i;
                while (x > 0) {
                    int r = x % 10;
                    if (i % r != 0) {
                        f = false;
                        break;
                    }
                    x /= 10;
                }
                if (f) res.add(i);
            }
        }
        return res;
    }
}