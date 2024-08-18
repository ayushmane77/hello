package myName.arrays;
import java.util.Scanner;
public class MaximumCircularSumSubarray {

    public static int sumOfCircularSubarray(int arr[]){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int currentMax=arr[i];
            int currentSum=arr[i];
            for(int j=1;j<arr.length;j++){
                int index=(i+j)%arr.length;
                currentSum=currentSum+arr[index];
                currentMax=Math.max(currentMax, currentSum);
            }
            res=Math.max(res, currentMax);
        }
        return res;
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
        int maxSum=sumOfCircularSubarray(arr);
        System.out.println("the maximum sum of circular subarray is " + maxSum);
        sc.close();
    }
}
