package myName.arrays;
import java.util.Scanner;
public class MaximumIndex {

    // Naive solution
    
    // public static int getMaximumDifference(int arr[]){
    //     int Max=Integer.MIN_VALUE;
    //     int difference=0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i;j<arr.length;j++){
    //             if(arr[i]<=arr[j]){
    //                 difference=j-i;
    //             }
    //             Max=Math.max(Max,difference);
    //         }
    //         difference=0;
    //     }
    //     return Max;
    // }
// -------------------------------------------------------------------------------------
    // EFFICIENT SOLUTIONS

    public static int getMaximumDifference(int arr[]){
        int difference=0;
        int Max=-1;
        int n=arr.length;
        int leftMin[]=new int[n];
        int rightMax[]=new int[n];
        leftMin[0]=arr[0];
        rightMax[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            leftMin[i]=Math.min(arr[i], leftMin[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i], rightMax[i+1]);
        }
        int i=0,j=0;
        while(i<n && j<n){
            if(leftMin[i]<rightMax[j]){
                difference=j-i;
                Max=Math.max(Max, difference);
                j++;
            }
            else{
                i++;
            }
        }
        return Max;
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
        int res=getMaximumDifference(arr);
        System.out.println("The maximum index difference is " + res);
        sc.close();
    }
}
