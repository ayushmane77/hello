package myName.arrays;
import java.util.Scanner;
public class Leaders {

    // public static void findLeaders(int arr[]){
        
    //     for(int i=0;i<arr.length;i++){
    //         boolean flag=true;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(i==arr.length-1){
    //                 flag=true;
    //                 break;
    //             }
    //             else if(arr[i]<=arr[j]){
    //                 flag=false;
    //                 break;
    //             }
    //         }
    //         if(flag==true){
    //             System.out.println("these are the leaders");
    //             System.out.print(arr[i] + " ");
    //             System.out.println();
    //         }
    //     }
    // }

    // BETTER APPROACH

    public static void findLeaders(int arr[]){
        System.out.println("these are the leaders");
        System.out.println(arr[arr.length-1]);
        int current_leader=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(current_leader<arr[i]){
                System.out.println(arr[i]);
                current_leader=arr[i];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findLeaders(arr);
        sc.close();
    }
}
