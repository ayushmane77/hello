package myName.LinkedList.CircularLinkedList;

class CreatingNode{
    int data;
    CreatingNode next;
    CreatingNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class TraversalAndPrintingOfCircularLinkedList {

    public static void print(CreatingNode head){
        CreatingNode curr = head;
        if(head!=null){
            do{
                System.out.println(curr.data);
                curr = curr.next;
            }while(curr!=head);
        }
    }
    public static void main(String[] args) {
        CreatingNode head = new CreatingNode(23);
        CreatingNode temp = new CreatingNode(97);
        CreatingNode temp2 = new CreatingNode(41);
        CreatingNode temp3 = new CreatingNode(76);
        head.next = temp;
        temp.next = temp2;
        temp2.next = temp3;
        temp3.next = head;
        print(head);
    }
}
