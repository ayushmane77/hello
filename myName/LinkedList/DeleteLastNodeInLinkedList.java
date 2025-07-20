package myName.LinkedList;
import java.util.Scanner;

class formingNode{
    int data;
    formingNode next;
    formingNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteLastNodeInLinkedList {

    public static formingNode deleteLastNode(formingNode head,int n){
        if(head==null || head.next == null){
            return null;
        }
        formingNode node = head;
        while(node.next.next!=null){
            node = node.next;
        }
        node.next = null;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of nodes");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("null");
        }
        else{
            System.out.println("enter the first node value");
            formingNode head = new formingNode(sc.nextInt());
            formingNode curr = head;
            System.out.println("enter the values of remaining nodes");
            for(int i=2;i<=n;i++){
                curr.next = new formingNode(sc.nextInt());
                curr = curr.next;
            }
            formingNode newNode = deleteLastNode(head,n);
            formingNode Curr = newNode;
            if(Curr == null){
                System.out.println("null");
            }
            while(Curr!=null){
                System.out.print(Curr.data + " ");
                Curr = Curr.next;
            }
        }
        sc.close();
    }
}
