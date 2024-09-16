class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0, r = people.length - 1, cnt = 0;
        while (l <= r) {
            cnt++;
            if (people[l] + people[r] <= limit) l++;
            r--;
        }
        return cnt;
    }
}