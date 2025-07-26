package myName.LinkedList.CircularLinkedList;

class newNodeFormation{
    int data;
    newNodeFormation next;
    newNodeFormation(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteHeadOfCircularLinkedList {

    public static newNodeFormation deleteHead(newNodeFormation head){
        if(head==null || head.next==head){
            return null;
        }
        newNodeFormation newHead = head.next;
        newNodeFormation curr = newHead;
        while(curr.next!=head){
            curr = curr.next;
        }
        curr.next = newHead;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        newNodeFormation head = new newNodeFormation(38);
        newNodeFormation temp = new newNodeFormation(90);
        newNodeFormation temp2 = new newNodeFormation(76);
        head.next = temp;
        temp.next = temp2;
        temp2.next = head;
        newNodeFormation newHead = deleteHead(head);
        newNodeFormation curr = newHead;
        if(newHead==null){
            System.out.println("null");
        }
        else{
            do{
            System.out.println(curr.data);
            curr = curr.next;
            }
            while(curr!=newHead);
        }    
    }
}
