public class DeleteMiddleLinkedList {
        static Node deleteMiddle(Node head) {
        /* If the list is empty or has only one node,
           return null as there is no middle node to delete */
            if (head == null || head.next == null) {
                return null;
            }

            // Initialize slow and fast pointers
            Node slow = head;
            Node fast = head.next.next;

            // Move 'fast' pointer twice as fast as 'slow'
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Delete the middle node by skipping it
            if (slow.next != null) {
                slow.next = slow.next.next;
            }
            return head;
        }

        static void printLL(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Creating a sample linked list:
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);

            // Display the original linked list
            System.out.print("Original Linked List: ");
            printLL(head);

            // Deleting the middle node
            head = deleteMiddle(head);

            // Displaying the updated linked list
            System.out.print("Updated Linked List: ");
            printLL(head);
        }
    }


