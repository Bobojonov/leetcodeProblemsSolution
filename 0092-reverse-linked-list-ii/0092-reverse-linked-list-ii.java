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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode curr = head;
        while (left > 1) {
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        }
        ListNode dummy = prev, tail = curr;
        ListNode tmp = null;
        while (right > 0) {
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
            right--;
        }
        if (dummy != null) dummy.next = prev;
        else head = prev;
        tail.next = curr;
        return head;
    }
}