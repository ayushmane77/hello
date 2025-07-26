package myName.LinkedList.CircularLinkedList;

class NodeCreating{
    int data;
    NodeCreating next;
    NodeCreating(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertAtBeginingOfCircularLinkedList {

    public static NodeCreating insertAtBegin(NodeCreating head,int value){
        NodeCreating newHead = new NodeCreating(value);
        if(head==null){
            newHead.next = newHead;
            return newHead;
        }
        NodeCreating curr = head;
        while(curr.next!=head){
            curr = curr.next;
        }
        curr.next = newHead;
        newHead.next = head;
        return newHead;
    }
    public static void main(String[] args) {
        NodeCreating head = new NodeCreating(67);
        NodeCreating temp = new NodeCreating(61);
        NodeCreating temp2 = new NodeCreating(81);
        head.next = temp;
        temp.next = temp2;
        temp2.next = head;
        int data = 84;
        NodeCreating curr = insertAtBegin(head, data);
        NodeCreating newHead = curr;
        do{
            System.out.println(curr.data);
            curr = curr.next;
        }while(curr!=newHead);
    }
}
