class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0, l = 0, r = people.length - 1;
        while (l <= r) {
            count++;
            if (people[l] + people[r] <= limit)
                l++;
            r--;
        }
        return count;
    }
}