public class RotateLinkedListKTimes {
    public static void main(String[] args) {
        Node head = null;
        //inserting Node
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,3);
        head=insertNode(head,4);
        head=insertNode(head,5);

        System.out.println("Original list: ");
        printList(head);

        int k = 2;
        Node newHead = rotateRight(head,k);

        System.out.println("After "+k+" iterations: ");
        printList(newHead);//list after rotating nodes

    }

    public static Node insertNode(Node head, int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null) temp = temp.next;

        temp.next = newNode;
        return head;
    }

    public static void printList(Node head) {
        while(head.next != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length = 1;
        Node temp = head;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        temp.next = head;
        k = k % length;
        int end = length - k;
        while (end-- != 0) temp = temp.next;
        head = temp.next;
        temp.next = null;

        return head;
    }
}
