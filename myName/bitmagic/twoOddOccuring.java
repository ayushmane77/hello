package myName.bitmagic;
import java.util.Scanner;
public class twoOddOccuring {

    // public static void printAllOddOccuringNo(int arr[],int n){
    //     for(int i=0;i<n;i++){
    //         int count=0;
    //         for(int j=0;j<n;j++){
    //             if(arr[i]==arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count%2!=0){
    //             System.out.println(arr[i]);
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the size of array");
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     System.out.println("enter the elements inside array");
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     System.out.println("your input array is");
    //     for(int j=0;j<arr.length;j++){
    //         System.out.println(arr[j]);
    //     }
    //     printAllOddOccuringNo(arr,n);
    //     sc.close();
    // }

    //EFFICIENT SOLUTION -----------------

    public static void printAllOddOccuringNo(int arr[],int n){
        int xor=0; int left=0; int right=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }
        int k=xor&(~(xor-1));
        for(int j=0;j<n;j++){
            if((arr[j] & k)!=0){
                left=left^arr[j];
            }
            else{
                right=right^arr[j];
            }
        }
        System.out.println(left + " " + right);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the elements inside the array");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("your input array is ");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        printAllOddOccuringNo(arr,n);
        sc.close();

    }
}
