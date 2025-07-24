package myName.LinkedList.DoublyLinkedList;

class CreatedNode{
    int data;
    CreatedNode prev;
    CreatedNode next;
    CreatedNode(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class InsertAtEndOfDoublyLinkedList {

    public static CreatedNode insertionAtEnd(CreatedNode head,int data){
        CreatedNode newNode = new CreatedNode(data);
        if(head==null){
            return newNode;
        }
        CreatedNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        return head;
    }
    public static void main(String[] args) {
        CreatedNode head = new CreatedNode(42);
        CreatedNode temp1 = new CreatedNode(75);
        head.next = temp1;
        temp1.prev = head;
        CreatedNode Curr = insertionAtEnd(head, 90);
        while(Curr!=null){
            System.out.println(Curr.data);
            Curr = Curr.next;
        }
    }
}
