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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list11 = list1;
        ListNode list22 = list2;
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        while (list11 != null && list22 != null){
            if (list11.val <= list22.val) {
                res.next = list11;
                list11 = list11.next;
                res = res.next;
            } else{
                res.next = list22;
                list22 = list22.next;
                res = res.next;
            }
        }
        while(list11 != null){
            res.next = list11;
            res = res.next;
            list11 = list11.next;
        }
        while(list22 != null){
            res.next = list22;
            res = res.next;
            list22 = list22.next;
        }
        return dummy.next;
    }
}