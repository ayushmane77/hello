package myName.LinkedList;
import java.util.Scanner;

class BuildingNode{
    int data;
    BuildingNode next;
    BuildingNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertionAtGivenPosition {

    public static BuildingNode insertAtgivenPosition(BuildingNode head, int pos, int val){
        BuildingNode newNode = new BuildingNode(val);
        if(pos == 1){
            newNode.next = head;
            return newNode;
        }
        BuildingNode curr = head;
        // for(int i=2;i<=pos-2 && curr!=null;i++){
        //     curr = curr.next;
        // }
        int count = 1;
        while(curr!=null && count < pos - 1){
            curr = curr.next;
            count++;
        }
        if(curr==null){
            System.out.println("Invalid position... size of linkedList is smaller than position");
            return head;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of nodes");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("enter the position of new node ");
            int pos = sc.nextInt(); // 
            System.out.println("enter the value of the node");
            int data = sc.nextInt();
            BuildingNode head = null;
            BuildingNode Head = insertAtgivenPosition(head,pos,data);
            BuildingNode Curr = Head;
            while(Curr!=null){
                System.out.print(Curr.data + " ");
                Curr = Curr.next;
            }
        }
        else{
            System.out.println("enter the first value of node");
            BuildingNode head = new BuildingNode(sc.nextInt());
            BuildingNode curr = head;
            System.out.println("enter the values of nodes ");
            for(int i=2;i<=n;i++){
                curr.next = new BuildingNode(sc.nextInt());
                curr = curr.next;
            }
            System.out.println("enter the position of new node");
            int pos = sc.nextInt();
            System.out.println("enter the value of the new node");
            int val = sc.nextInt();
            BuildingNode Head = insertAtgivenPosition(head,pos,val);
            BuildingNode Curr = Head;
            while(Curr!=null){
                System.out.print(Curr.data + " ");
                Curr = Curr.next;
            }
        }
        sc.close();
        
    }
}
