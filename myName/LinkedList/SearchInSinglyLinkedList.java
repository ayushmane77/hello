package myName.LinkedList;
import java.util.Scanner;

class nodeBirth{
    int data;
    nodeBirth next;
    nodeBirth(int data){
        this.data = data;
        this.next = null;
    }
}
public class SearchInSinglyLinkedList {
    // Iterative solution
    public static int search(nodeBirth head,int x){
        int count = 1;
        nodeBirth curr = head;
        while(curr!=null){
            if(curr.data == x){
                return count;
            }
            curr = curr.next;
            count++;
        }
        return -1;
    }
    // Time complexity : O(N)
    // Auxiliary space : O(1)

    // Recursive solution
    public static int search(nodeBirth head,int x,int count){
        nodeBirth curr = head;
        if(curr==null){
            return -1;
        }
        if(curr.data==x){
            return count;
        }
        count = count + 1;
        return search(head.next, x, count);
    }
    // Time complexity : O(N)
    // Auxiliary space : O(N)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of nodes");
        int n = sc.nextInt();
        if(n==0){
            System.out.println(-1);
        }
        else{
            System.out.println("enter the value of the fist node");
            nodeBirth head = new nodeBirth(sc.nextInt());
            nodeBirth curr = head;
            System.out.println("enter the value of remaining node");
            for(int i=2;i<=n;i++){
                curr.next = new nodeBirth(sc.nextInt());
                curr = curr.next;
            }
            System.out.println("enter the target value");
            int x = sc.nextInt();
            int ans = search(head, x);
            System.out.println(ans);
            int count = 1;
            int res = search(head,x,count);
            System.out.println(res);
        }
        sc.close();
    }
}
