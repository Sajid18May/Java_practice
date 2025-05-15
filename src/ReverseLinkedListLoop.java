
   class ListNode {
      int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

   public class ReverseLinkedListLoop {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode currentNode=head;
        ListNode previous=null;
        while(currentNode!=null){

            ListNode front=currentNode.next;

            currentNode.next=previous;
            previous=currentNode;
            currentNode=front;
        }
        return previous;
    }
}