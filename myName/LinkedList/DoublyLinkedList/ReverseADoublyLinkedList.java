package myName.LinkedList.DoublyLinkedList;

class NodeCreated{
    int data;
    NodeCreated prev;
    NodeCreated next;
    NodeCreated(int data){
        this.data = data;
        this.prev = null;
        this.next = null; // 10->20->40
    }                     // 40->20->10
}
public class ReverseADoublyLinkedList {
    
    public static NodeCreated reverse(NodeCreated head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        NodeCreated temp = null;
        NodeCreated curr = head;
        while(curr!=null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp!=null){
            head = temp.prev;
        }
        return head;
    }
    public static void main(String[] args) {
        NodeCreated head = new NodeCreated(23);
        NodeCreated temp = new NodeCreated(64);
        NodeCreated temp2 = new NodeCreated(85);
        head.next = temp;
        temp.prev = head;
        temp.next = temp2;
        temp2.prev = temp;
        NodeCreated curr = reverse(head);
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
