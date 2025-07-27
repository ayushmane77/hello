package myName.LinkedList.CircularLinkedList;

class CreationOfNewNode{
    int data;
    CreationOfNewNode next;
    CreationOfNewNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteKthNodeOfCircularLinkedList {

    public static CreationOfNewNode deleteKthNode(CreationOfNewNode head,int value){
        if(value<=0){
            System.out.println("Invalid position");
            return head;
        }
        if(value==1){
            CreationOfNewNode newHead = deleteHead(head);
            return newHead;
        }
        CreationOfNewNode curr = head;
        for(int i=1;i<value-1;i++){
            curr = curr.next;
            if(curr==head){
                System.out.println("Invalid position entered");
                return head;
            }
        }
        curr.next = curr.next.next;
        return head;
    }
    public static CreationOfNewNode deleteHead(CreationOfNewNode head){
        if(head == null || head.next == head){
            return null;
        }
        CreationOfNewNode newHead = head.next;
        CreationOfNewNode curr = head.next;
        while(curr.next!=head){
            curr = curr.next;
        }
        curr.next = newHead;
        return newHead;
    }
    public static void main(String[] args) {
        CreationOfNewNode head = new CreationOfNewNode(79);
        CreationOfNewNode temp = new CreationOfNewNode(32);
        CreationOfNewNode temp2 = new CreationOfNewNode(10);
        head.next = temp;
        temp.next = temp2;
        temp2.next = head;
        CreationOfNewNode newHead = deleteKthNode(head, 2);
        CreationOfNewNode curr = newHead;
        do{
            System.out.println(curr.data);
            curr = curr.next;
        }
        while(curr!=newHead);
    }
}
