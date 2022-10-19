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
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode(0);
        ListNode less = lessHead;
        ListNode greatHead = new ListNode(0);
        ListNode great = greatHead;
        while (head != null) {
            if (head.val < x) {
                less.next = head;
                less = less.next;
            } 
            else {
                great.next = head;
                great = great.next;
            }
            head = head.next;
        }
        great.next = null;
            less.next = greatHead.next;
        return lessHead.next;
    }
}