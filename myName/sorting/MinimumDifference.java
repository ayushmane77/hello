package myName.sorting;

import java.util.Arrays;
import java.util.Scanner;
public class MinimumDifference {

    // public static int minDifference(int arr[]){
    //     Arrays.sort(arr);
    //     int diff;
    //     int ans=Integer.MAX_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             diff=Math.abs(arr[i]-arr[j]);
    //             ans=Math.min(diff,ans);
    //         }
    //     }
    //     return ans;
    // }

    // better approach

    public static int minDifference(int arr[]){
        Arrays.sort(arr);
        int ans=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            ans=Math.min(arr[i]-arr[i-1], ans);
        }
        return ans;
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
        int ans=minDifference(arr);
        System.out.println("the minimum difference is " + ans);
        sc.close();
    }
}
