public class SortingLinkedList {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode left=head;
        ListNode right=slow.next;
        slow.next=null;
        left=sortList(left);
        right=sortList(right);
        return mergeList(left,right);
    }
    public static ListNode mergeList(ListNode left,ListNode right){
        ListNode dummyNode=new ListNode(-1);
        ListNode temp=dummyNode;
        while(left !=null && right !=null){
            if(left.val>right.val){
                temp.next=right;
                temp=temp.next;
                right=right.next;
            }else{
                temp.next=left;
                temp=temp.next;
                left=left.next;
            }
        }
        if(left == null){
            temp.next=right;
        }else{
            temp.next=left;
        }
        return dummyNode.next;
    }
}
