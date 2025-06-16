public class MergeTwoSortedLists {
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
