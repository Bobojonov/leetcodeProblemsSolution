class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        String sign = (numerator < 0 == denominator < 0 || numerator == 0) ? "" : "-";
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        StringBuilder res = new StringBuilder();
        res.append(sign);
        res.append(num / den);
        long r = num % den;
        if (r == 0) return res.toString();
        res.append(".");
        HashMap<Long, Integer> map = new HashMap<>();
        while (r != 0) {
            if (!map.containsKey(r)) {
                map.put(r, res.length());
            } else {
                int idx = map.get(r);
                return res.substring(0, idx) + "(" + res.substring(idx) + ")";
            }
            r *= 10;
            res.append(r / den);
            r = r % den;
        }
        return res.toString();
    }
}