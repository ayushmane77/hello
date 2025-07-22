package myName.LinkedList.SinglyLinkedList;
import java.util.Scanner;

class Nodeforming{
    int data;
    Nodeforming next;
    Nodeforming(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteFirstNodeInLinkedList {

    public static Nodeforming deleteFirstNode(Nodeforming head){
        Nodeforming newHead = head;
        if(head==null){
            return null;
        }
        newHead = head.next;
        return newHead;
    }
    // time complexity : O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of nodes to insert ");
        int n = sc.nextInt();
        System.out.println("enter the value of the first node");
        Nodeforming head = new Nodeforming(sc.nextInt());
        Nodeforming curr = head;
        for(int i=2;i<=n;i++){
            curr.next = new Nodeforming(sc.nextInt());
            curr = curr.next;
        }
        Nodeforming newhead = deleteFirstNode(head);
        Nodeforming Curr = newhead;
        if(Curr == null){
            System.out.println("null");
        }
        while(Curr != null){
            System.out.print(Curr.data + " ");
            Curr = Curr.next;
        }
        
        sc.close();
    }
}
