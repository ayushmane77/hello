package myName.arrays;
import java.util.Scanner;
public class MoveZeroToEnd {

    public static int[] moveZeroToEnd(int arr[]){
        int count=0;
        int temp;  // [12,42,0,0,34,0,8]
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=moveZeroToEnd(arr);
        System.out.println("this is the final array");
        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j] + " ");
        }
        sc.close();
    }
}
