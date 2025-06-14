public class Adding2NumsInLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummnyNode = new ListNode(-1);
        ListNode current = dummnyNode;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) sum += l1.val;
            if (l2 != null) sum += l2.val;
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            current.next = newNode;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            current = current.next;
        }
        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }
        return dummnyNode.next;
    }
}
