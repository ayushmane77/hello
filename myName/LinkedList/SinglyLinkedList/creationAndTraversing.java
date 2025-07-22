package myName.LinkedList.SinglyLinkedList;

class newNode{
    int data; // data field to store the value
    newNode next; // next field to store the address of the next node
    newNode(int data){ // constructor to initialize the node
        this.data = data; // assign the data to the node
        this.next = null; // initialize next to null
    }
}
public class creationAndTraversing {

    public static void print(newNode head){ // method to traverse and print the linked list
        newNode curr = head; // start from the head of the linked list
        while(curr!=null){ // loop until we reach the end of the linked list
            System.out.print(curr.data + " "); // print the data of the current node
            curr = curr.next; // move to the next node
        }
    }
    // Time complexity : O(N)
    // Auxiliary space : O(1)
    public static void main(String[] args) {
        newNode head = new newNode(23); // head is actually an object which is having an address.
        newNode temp2 = new newNode(45); // temp2 is a reference variable which is pointing to an object.
        newNode temp3 = new newNode(63); // temp3 is a reference variable which is pointing to an object.
        head.next = temp2; // head is pointing to temp2.
        temp2.next = temp3; // temp2 is pointing to temp3.
        print(head);
    }
}
