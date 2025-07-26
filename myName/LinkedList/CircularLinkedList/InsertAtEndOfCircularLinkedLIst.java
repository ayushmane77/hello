package myName.LinkedList.CircularLinkedList;

class FormingNewNode{
    int data;
    FormingNewNode next;
    FormingNewNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertAtEndOfCircularLinkedLIst {

    public static FormingNewNode insertionAtEnd(FormingNewNode head, int value){
        FormingNewNode newNode = new FormingNewNode(value);
        if(head==null){
            newNode.next = newNode;
            return newNode;
        }
        FormingNewNode curr = head;
        while(curr.next!=head){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
        return head;
    }
    public static void main(String[] args) {
        FormingNewNode head = new FormingNewNode(87);
        FormingNewNode temp = new FormingNewNode(62);
        FormingNewNode temp2 = new FormingNewNode(70);
        head.next = temp;
        temp.next = temp2;
        temp2.next = head;
        FormingNewNode curr = insertionAtEnd(head, 56);
        do{
            System.out.println(curr.data);
            curr = curr.next;
        }while(curr!=head);
    }
}
