package myName.LinkedList.DoublyLinkedList;

class buildingNodes{
    int data;
    buildingNodes prev;
    buildingNodes next;
    buildingNodes(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DeleteEndOfDoublyLinkedList {

    public static buildingNodes deleteAtEnd(buildingNodes head){
        buildingNodes curr = head;
        if(head==null || head.next == null){
            return null;
        }
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next.prev = null;
        curr.next = null;
        return head;
    }
    public static void main(String[] args) {
        buildingNodes head = new buildingNodes(56);
        buildingNodes temp = new buildingNodes(70);
        buildingNodes temp2 = new buildingNodes(82);
        head.next = temp;
        temp.prev = head;
        temp.next = temp2;
        temp2.prev = temp;
        buildingNodes curr = deleteAtEnd(head);
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
