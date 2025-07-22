package myName.LinkedList.DoublyLinkedList;

class nodeOfDoublyLinkedList{
    int data;
    nodeOfDoublyLinkedList prev;
    nodeOfDoublyLinkedList next;
    nodeOfDoublyLinkedList(int data){
        this.data = data;
    }
}
public class InsertAtBeginOfDoublyLinkedList {

    public static nodeOfDoublyLinkedList insertionAtBegin(nodeOfDoublyLinkedList head,int data){
        nodeOfDoublyLinkedList newHead = new nodeOfDoublyLinkedList(data);
        if(head==null){
            return newHead;
        }
        newHead.next = head;
        head.prev = newHead;
        return newHead;
    }
    public static void main(String[] args) {
        nodeOfDoublyLinkedList head = new nodeOfDoublyLinkedList(67);
        nodeOfDoublyLinkedList temp1 = new nodeOfDoublyLinkedList(43);
        head.next = temp1;
        temp1.prev = head;
        nodeOfDoublyLinkedList curr = insertionAtBegin(head, 77);
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
