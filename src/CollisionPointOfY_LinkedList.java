public class CollisionPointOfY_LinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=0,lengthB=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            lengthA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            lengthB++;
            tempB=tempB.next;
        }
        int diff=lengthA-lengthB;
        tempA=headA;
        tempB=headB;
        if(diff>0){
            while(diff>0){
                tempA=tempA.next;
                diff--;
            }
        }
        else{
            while(diff<0){
                tempB=tempB.next;
                diff++;
            }
        }
        while( tempA!=null && tempB!=null ){
            if(tempA==tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}
