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
        ListNode hair = head;
        ListNode tort = head;
        while(hair != null && hair.next != null){
            hair = hair.next.next;
            tort = tort.next;
            if(hair == tort){
                return true;
            }
        }
        return false;
    }
}
