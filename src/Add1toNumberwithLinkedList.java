public class Add1toNumberwithLinkedList {

    /*************************************************************

     Following is the class structure of the Node class:

     class Node {
     public int data;
     public Node next;

     Node(int data) {
     this.data = data;
     this.next = null;
     }
     }
     *************************************************************/

    private static int helper(Node temp) {
        if (temp == null) return 1;
        int carry = helper(temp.next);
        temp.data = temp.data + carry;

        if (temp.data < 10) {
            return 0;
        }

        temp.data = 0;
        return 1;
    }

    public static Node addOne(Node head) {
        // Write your code here.
        int carry = helper(head);
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
}
