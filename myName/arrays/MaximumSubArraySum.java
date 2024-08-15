package myName.arrays;
import java.util.*;
public class MaximumSubArraySum {

    public static int maximumSubArraySum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){ // [5,4,2,6,7]
                currentSum=currentSum+arr[j];
                maxSum=Math.max(maxSum, currentSum);
            }
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
        int res=maximumSubArraySum(arr);
        System.out.println("the maximum subarray sum is " + res);
        sc.close();
    }
}
