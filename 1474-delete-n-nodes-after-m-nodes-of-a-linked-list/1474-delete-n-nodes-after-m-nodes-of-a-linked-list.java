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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode last = head;
        ListNode curr = head;
        while (curr != null) {
            int cntM = m, cntN = n;
            while (curr != null && cntM != 0){
                last = curr;
                curr = curr.next;
                cntM--;
            }
            while (curr != null && cntN != 0) {
                curr = curr.next;
                cntN--;
            }
            last.next = curr;
            }
        return head;
        }
    
}