/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> curr = new ArrayList<>();
        while (head != null){
            curr.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = curr.size() - 1;
        while (left < right){
            if (curr.get(left) != curr.get(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}

