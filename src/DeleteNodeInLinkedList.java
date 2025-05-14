public class DeleteNodeInLinkedList {
    public static void main(String[] args) {
        LL l1=new LL();
        l1.addFirst(3);
        l1.addFirst(5);
        l1.addLast(7);
        l1.addLast(9);
        l1.addLast(11);
        //l1.printList();
        //l1.getSize();
        //l1.removeFirst();
        //l1.removeLast();
        l1.addInMiddle(3,33);
        l1.printList();
    }
}
class LL{
    Node head=null;
    private int size=0;
    public class Node {
        int val;
        Node next;
        Node(int x) {
            val = x;
            next=null;
            size++;
        }
    }

    public void printList(){
        Node currentNode=this.head;
        while (currentNode!=null){
            System.out.print(currentNode.val+"->");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }
    public void getSize(){
        System.out.println("List size = "+this.size);
    }

    public void addFirst(int x){
        Node newNode=new Node(x);
        newNode.next=this.head;
        this.head=newNode;

    }

    public void addLast(int x){
        Node newNode=new Node(x);
        Node currentNode=this.head;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;

    }
    public void removeFirst(){
        if(head==null){
            System.out.println("List is already empty");
        }
        else{
            this.head = this.head.next;
            size--;
        }
    }
    public void removeLast(){
        if(head==null){
            System.out.println("List is already empty");
        } else if (head.next==null) {
            this.head=null;
            size--;
        } else{
            Node currentNode=this.head;
            Node lastNode=this.head.next;
            while (lastNode.next!=null){
                currentNode=currentNode.next;
                lastNode=lastNode.next;
            }
            currentNode.next=null;
            size--;
        }
    }
    public void addInMiddle(int index, int val){
        if(index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;
        Node newNode=new Node(val);
        if(head==null || index==0){
            this.head=newNode;
            return;
        }
        Node currentNode=this.head;
        for (int i = 1; i < size; i++) {
            if(index==i){
                Node nextNode=currentNode.next;
                currentNode.next=newNode;
                newNode.next=nextNode;
                break;
            }
            currentNode=currentNode.next;
        }
    }
}
