class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode ptr = head;
        while (list1 != null && list2 != null) {
            if (list2.val <= list1.val) {
                ptr.next = list2;
                list2 = list2.next;
            } else {
                ptr.next = list1;
                list1 = list1.next;
            }
            ptr = ptr.next;
        }
        if (list1 == null) {
            ptr.next = list2;
        } else {
            ptr.next = list1;
        }
        return head.next;
    }
}
