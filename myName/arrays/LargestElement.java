package myName.arrays;
import java.util.Scanner;
public class LargestElement {

    public static int largestElement(int arr[]){
        // int max=arr[0];
        // for(int j=0;j<arr.length;j++){
        //     if(arr[j]>max){
        //         max=arr[j];
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==max){
        //         return i;
        //     }
        // }
        // return 0;

        // OR
        
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the elements inside an array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=largestElement(arr);
        System.out.println(res);
        sc.close();
    }
}
