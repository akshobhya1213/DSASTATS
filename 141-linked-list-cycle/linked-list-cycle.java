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
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tu = head;
        ListNode ra = head;

        while( tu != null && ra != null && ra.next != null){

            tu = tu.next;
            ra = ra.next.next;

            if(tu == ra ){
                return true;
            }


        }

        return false;
    }
}