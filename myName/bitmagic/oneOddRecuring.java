package myName.bitmagic;
import java.util.Scanner;
public class oneOddRecuring {

    // public static int printOddNUmberOccuring(int arr[],int n){
    //     for(int i=0;i<n;i++){
    //         int count=0;
    //         for(int j=0;j<n;j++){
    //             if(arr[i]==arr[j]){
    //                 count++;
                    
    //             }   
    //         }
    //         if(count%2!=0){
    //             return arr[i];
    //         } 
            
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the size of array");
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     System.out.println("enter the elements inside an array");
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     System.out.println("your input array is ");
    //     for(int j=0;j<arr.length;j++){
    //         System.out.println(arr[j]);
    //     }
    //     int count=printOddNUmberOccuring(arr,n);
    //     System.out.println(count);
    //     sc.close();
    // }

 // better approach 
 
    public static int printOddNumberOccuring(int arr[],int n){
        int res=arr[0];
        for(int i=1;i<n;i++){
            res=res^arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the elements inside array");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("your input array is ");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        int result=printOddNumberOccuring(arr,n);
        System.out.println(result);
        sc.close();
    }
}
