package myName.searching;
import java.util.Scanner;

public class binarySearch {
    // binary search works only in case when the given input array is sorted
    // public static int BinarySearch(int arr[],int target){ // iterative
    //     int low=0;
    //     int high=arr.length-1;
    //     while(low<=high){
    //         int mid=(low + high)/2;
    //         if(arr[mid]==target){
    //             return mid;
    //         }
    //         if(arr[mid]>target){
    //             high=mid-1;
    //         }
    //         else{
    //             low=mid+1;
    //         }
    //     }
    //     return -1;
    // }

    // Time complexity :O(logN);
    // Auxiliary space : O(1);

    // ---------------------------------------------------

    // Recursive approach
    public static int BinarySearch(int arr[],int low,int high,int x){

        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]>x){
            return BinarySearch(arr, low, mid-1, x);
        }
        else{
            return BinarySearch(arr, mid+1, high, x);
        }
        
    }
    //  Time complexity : O(logN);
    //  Auxiliary space : O(logN);
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        System.out.println("Please enter elements insider array in sorted order");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the elements you want to search");
        int x=sc.nextInt();
        // int res=BinarySearch(arr,x);
        int low=0;
        int high=n-1;
        int res=BinarySearch(arr,low,high,x);
        System.out.println("the element is found at index " + res);
        sc.close();
    }
}
