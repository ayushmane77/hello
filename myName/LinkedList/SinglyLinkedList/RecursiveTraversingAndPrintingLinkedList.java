package myName.LinkedList.SinglyLinkedList;
import java.util.Scanner;

class Nodes{
    int data;
    Nodes next;
    Nodes(int data){
        this.data = data;
        this.next = null;
    }
}
public class RecursiveTraversingAndPrintingLinkedList {
    public static void print(Nodes head){
        if(head==null){
            return;
        }
        System.out.print(head.data + " -> ");
        Nodes curr = head.next;
        print(curr); // or print(head.next) will also work
    }
    // Time complexity : O(N)
    // Auxiliary space : O(N) 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of nodes to insert");
        int n = sc.nextInt();
        System.out.println("enter the first node data");
        Nodes head = new Nodes(sc.nextInt());
        Nodes curr = head;
        for(int i=2;i<=n;i++){
            curr.next = new Nodes(sc.nextInt());
            curr = curr.next;
        }
        print(head);
        sc.close();
    }
}
