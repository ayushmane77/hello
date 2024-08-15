package myName.arrays;
import java.util.Scanner;
public class TrappingRainWater {

    // NAIVE SOLUTIONS

    // public static int calculateCapacity(int arr[]){
    //     int res=0;
    //     for(int i=1;i<arr.length-1;i++){ //[1,5,0,3]
    //         int leftMax=arr[i];
    //         for(int j=0;j<i;j++){
    //             leftMax=Math.max(leftMax, arr[j]);
    //         }
    //         int rightMax=arr[i];
    //         for(int k=i+1;k<arr.length;k++){
    //             rightMax=Math.max(rightMax, arr[k]);
    //         }
    //         res=Math.min(leftMax, rightMax)-arr[i] + res;
    //     }
    //     return res;
    // }

    // BETTER APPROACH

    public static int calculateCapacity(int arr[]){
        int n=arr.length;
        int res=0;
        int leftMax[] =new int[n];
        int rightMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i], leftMax[i-1]);
        }
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i], rightMax[i+1]);
        }

        for(int j=1;j<n;j++){
            res=Math.min(leftMax[j], rightMax[j])-arr[j] + res;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=calculateCapacity(arr);
        System.out.println("the capacity to store water is " + res);
        sc.close();
    }
}
