package myName.LinkedList.SinglyLinkedList;

class node{
    int data;
    node next;
    node(int Data){
        this.data = Data;
        this.next = null;
    }
}
public class InsertAtEndOfLinkedList {
    
    public static void insertAtEnd(node head,int val){
        node lastNode = new node(val);
        node curr = head;
        boolean flag = true;
        while(curr!=null){
            if(curr.next==null && flag==true){
                curr.next = lastNode;
                flag = false;
            }
            else{
                curr = curr.next;
            }
        }
        node newCurr = head;
        while(newCurr!=null){
            System.out.println(newCurr.data);
            newCurr = newCurr.next;
        }
    }
    public static void main(String[] args) {
        node head = new node(65);
        node temp2 = new node(52);
        head.next = temp2;
        insertAtEnd(head,78);
    }
}
