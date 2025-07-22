package myName.LinkedList.SinglyLinkedList;
import java.util.Scanner;

class NodeCreation{
    int data;
    NodeCreation next;
    NodeCreation(int Data){
        this.data = Data;
        this.next = null;
    }
}
public class InsertAtbeginningOfLinkedList {

    public static NodeCreation insertAtBeginning(NodeCreation head,int val){
        NodeCreation newHead = new NodeCreation(val);
        newHead.next = head;
        return newHead;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of nodes to insert");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("enter the value to be inserted at the head");
            int firsVal = sc.nextInt();
            NodeCreation head = null;
            head = insertAtBeginning(head, firsVal);
            NodeCreation curr = head;
            while(curr!=null){
                System.out.println(curr.data);
                curr = curr.next;
            }
        }
        else{
            System.out.println("enter the value of first node");
            NodeCreation head = new NodeCreation(sc.nextInt());
            NodeCreation curr = head;
            System.out.println("enter the remaining values of node");
            for(int i=2;i<=n;i++){
                curr.next = new NodeCreation(sc.nextInt());
                curr = curr.next;
            }
            System.out.println("enter the value to be inserted at the head ");
            int val = sc.nextInt();
            NodeCreation newLinkedList = insertAtBeginning(head,val);
            NodeCreation Curr = newLinkedList;
            while(Curr!=null){
                System.out.print(Curr.data + " ");
                Curr = Curr.next;
            }
        }
        sc.close();
    }
}
