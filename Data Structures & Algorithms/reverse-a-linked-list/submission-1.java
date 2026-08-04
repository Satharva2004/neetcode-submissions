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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode dummy = head;
        Stack<ListNode> stack = new Stack<>();
        while(dummy != null){
            stack.push(dummy);
            dummy = dummy.next;
        }
        ListNode new_head = stack.pop();
        ListNode curr = new_head;
        while(!stack.isEmpty()){
            curr.next = stack.pop();
            curr = curr.next;
        }
        curr.next = null;
        return new_head;
    }
}
