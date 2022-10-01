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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head = new ListNode(0);
        ListNode l3 = dummy_head;
        int remain = 0;
        while (l1 != null || l2 != null) {
            int val_l1 = (l1 != null) ? l1.val : 0;
            int val_l2 = (l2 != null) ? l2.val : 0;
            int current = val_l1 + val_l2 + remain;
            remain = current / 10;
            int last_digit = current % 10;
            ListNode  new_node = new ListNode(last_digit);
            l3.next = new_node;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            l3 = l3.next;
        }
        if (remain > 0) {
            ListNode new_node = new ListNode(remain);
            l3.next = new_node;
            l3 = l3.next;
        }
        return dummy_head.next;
    }
}