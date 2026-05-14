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
    public boolean hasCycle(ListNode head) {
        ListNode dummy = head;
        ListNode hair = head;
        while(hair != null && hair.next != null){
            dummy = dummy.next;
            hair = hair.next.next;
            if(dummy == hair){
                return true;
            }
        }
        return false;
    }
}
