package myName.arrays;
import java.util.Scanner;

public class SlidingWIndow {

    // public static int  kthMaxConsecutiveSum(int arr[],int k){
    //     int maxSum=Integer.MIN_VALUE;  // [1,8,30,-5,20,7]
    //     int m=0;
    //     if(k<=1){
    //         System.out.println("the consecutive sum should have k value more than 1");
    //         return -1;
    //     }
    //     else{
    //         for(int i=0;i<i+k-1;i++){      // [5,-2,6,-1,5,70]
    //             int currentSum=0;
    //             m=i;
    //             if (m>arr.length-k) {
    //                 break;
    //             }
    //             else{
    //                 for(int j=0;j<k;j++){
    //                     if(m==arr.length){
    //                         break;
    //                     }
    //                     else{
    //                         currentSum=currentSum+arr[m];
    //                         maxSum=Math.max(maxSum, currentSum);
    //                         m++;
    //                     }  
    //                     }  
    //                 }   
    //             }
    //     }
    //     return maxSum; 
    // }

    public static int kthMaxConsecutiveSum(int arr[],int k){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<k;i++){
            currentSum=currentSum+arr[i];
        }
        for(int i=k;i<arr.length;i++){
            currentSum = currentSum + arr[i] - arr[i-k];
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
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
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        int res=kthMaxConsecutiveSum(arr,k);
        System.out.println("the maximum kth sum of consecutive array elements is " + res);
        sc.close();
    }
}
