public class DeleteNodeInLinkedList {
    public static void main(String[] args) {
        int[] head = {4,5,1,9};
        int node = 5;
    }



    public static void deleteNode(LL.ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
class LL{
    ListNode head=null;
    private int size=0;
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next=null;
        }
    }
}
