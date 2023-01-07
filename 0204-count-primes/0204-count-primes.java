import java.util.Objects;
import java.util.Vector;
class Solution {
 
    public  int countPrimes(int n) {
        int cnt = 0;
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!primes[i]) {
                for (int j = i * i; j < n; j +=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++)
            if(!primes[i]) cnt++;
        return cnt;
    }
}