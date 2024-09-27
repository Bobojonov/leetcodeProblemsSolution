class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[letters.length - 1] <= target) target = letters[0];
        else target++;
        int l = 0, r = letters.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (letters[mid] == target) return letters[mid];
            else if (letters[mid] < target) l = mid + 1;
            else r = mid;
        }
        return letters[r];
    }
}