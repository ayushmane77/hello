package myName.arrays;
import java.util.Scanner;
public class Insertion {

    public static int[] insertElement(int arr[],int n,int x,int pos){
        if(n==arr.length){
            return arr;
        }
        int index=pos-1;
        for(int j=n-1;j>=index;j--){
            arr[j+1]=arr[j];
        }
        // for(int j=index;j<n-1;j++){
        //     arr[j+1]=arr[j];
        // }
        arr[index]=x;

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements inside an array");
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to insert");
        int x=sc.nextInt();
        System.out.println("enter the position of " + x);
        int pos=sc.nextInt();
        
        if(pos>n){
            System.out.println("enter a valid position for array size " + n);
        }
        else{
            int res[]=insertElement(arr,n,x,pos);
            for(int i=0;i<n;i++){
                System.out.println(res[i]);
            }
        }
        
        sc.close();
    }
}
