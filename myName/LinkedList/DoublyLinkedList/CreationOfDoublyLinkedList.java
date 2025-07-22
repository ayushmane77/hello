package myName.LinkedList.DoublyLinkedList;

class doublyLinkedListNode{
    int data;
    doublyLinkedListNode prev;
    doublyLinkedListNode next;
    doublyLinkedListNode(int data){
        this.data = data;
        this.prev = null; // if this is not assigned , then by default this field is null.
        this.next = null; // same
    }
}
public class CreationOfDoublyLinkedList {
    public static void main(String[] args) {
        doublyLinkedListNode head = new doublyLinkedListNode(23);
        doublyLinkedListNode temp1 = new doublyLinkedListNode(64);
        doublyLinkedListNode temp2 = new doublyLinkedListNode(18);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        doublyLinkedListNode curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            // System.out.println(curr.prev.data); can also access previous node data
            curr = curr.next;
        }
    }
}
