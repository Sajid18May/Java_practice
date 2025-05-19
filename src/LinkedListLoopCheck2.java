public class LinkedListLoopCheck2 {
    static class ListNode {
        // Data stored in the node
        public int data;
        // Pointer to the next node in the list
        public ListNode next;

        // Constructor with both data
        // and next node as parameters
        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        // Constructor with only data as
        // a parameter, sets next to null
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode hasCycle2(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;

        // Make a loop from node5 to node2
        node5.next = node2;

        // Set the head of the linked list
        ListNode head = node1;

        // Detect the loop in the linked list
        ListNode loopStartNode = hasCycle2(head);

        if (loopStartNode != null) {
            System.out.println("Loop detected. Starting node of the loop is: " + loopStartNode.data);
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}
