package myName.arrays;
import java.util.Scanner;
public class LeftRotate {

    public static int[] leftRotate(int arr[]){
        // int temp=arr[0];
        // arr[0]=arr[arr.length-1];
        // arr[arr.length-1]=temp;
        int temp=arr[arr.length-1];
        arr[arr.length-1]=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(i==arr.length-2){
                arr[i]=temp;
            } // [4,5,8,3,6] => [5,8,3,6,1]
            else{
                arr[i]=arr[i+1];
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
        int arr1[]=leftRotate(arr);
        System.out.println("this is the left rotated array");
        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j] + " ");
        }
        sc.close();
    }
}
