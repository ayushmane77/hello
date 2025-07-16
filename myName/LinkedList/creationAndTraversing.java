package myName.LinkedList;

class Node{
    int data; // data field to store the value
    Node next; // next field to store the address of the next node
    Node(int data){ // constructor to initialize the node
        this.data = data; // assign the data to the node
        this.next = null; // initialize next to null
    }
}
public class creationAndTraversing {

    public static void print(Node head){ // method to traverse and print the linked list
        Node curr = head; // start from the head of the linked list
        while(curr!=null){ // loop until we reach the end of the linked list
            System.out.print(curr.data + " "); // print the data of the current node
            curr = curr.next; // move to the next node
        }
    }
    public static void main(String[] args) {
        Node head = new Node(23); // head is actually an object which is having an address.
        Node temp2 = new Node(45); // temp2 is a reference variable which is pointing to an object.
        Node temp3 = new Node(63); // temp3 is a reference variable which is pointing to an object.
        head.next = temp2; // head is pointing to temp2.
        temp2.next = temp3; // temp2 is pointing to temp3.
        print(head);
    }
}
