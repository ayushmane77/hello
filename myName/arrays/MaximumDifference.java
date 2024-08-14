package myName.arrays;
import java.util.Scanner;
public class MaximumDifference {
    
    // public static int maximumDifference(int arr[]){
    //     int maxD=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=i+1;j<arr.length;j++){ // [45,54,23,25,44]
    //             int currentMaxD=arr[j]-arr[i];
    //             if(maxD<currentMaxD){
    //                 maxD=currentMaxD;
    //             }
    //         }
    //     }
    //     return maxD;
    // }

    //  BETTER APPROACH

    public static int maximumDifference(int arr[]){
        int res=arr[1]-arr[0];
        int minValue=arr[0];
        for(int j=1;j<arr.length;j++){
            res=Math.max(res, arr[j]-minValue);
            minValue=Math.min(minValue, arr[j]);
        }
        return res;
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
        int res=maximumDifference(arr);
        System.out.println(" The maximum difference is " + res);
        sc.close();
    }
}
