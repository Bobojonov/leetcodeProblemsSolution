/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashSet;
import java.util.Set;
public class Solution {
  // class ListNode {
  //     int val;
  //     ListNode next;
  //     ListNode(int x) {
  //         val = x;
  //         next = null;
  //     }
  // }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if (set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}