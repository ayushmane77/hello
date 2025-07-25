package myName.LinkedList.DoublyLinkedList;

class FormingNodes{
    int data;
    FormingNodes prev;
    FormingNodes next;
    FormingNodes(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DeleteHeadofDoublyLinkedList {

    public static FormingNodes deleteHead(FormingNodes head){
        if(head==null || head.next==null){
            return null;
        }
        FormingNodes newHead = head.next;
        newHead.prev = null;
        return  newHead;
    }
    public static void main(String[] args) {
        FormingNodes head = new FormingNodes(67);
        FormingNodes temp = new FormingNodes(22);
        FormingNodes temp2 = new FormingNodes(86);
        head.next = temp;
        temp.prev = head;
        temp.next = temp2;
        temp2.prev = temp;
        FormingNodes curr = deleteHead(head);
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
