package myName.searching;
import java.util.Scanner;
public class PeakElement {

    // Naive solution

    // public static int findPeakElement(int arr[]){
    //     if(arr.length==1){
    //         return arr[0];
    //     }
    //     if(arr[arr.length-1]>arr[arr.length-2]){
    //         return arr[arr.length-1];
    //     }
    //     for(int i=0;i<arr.length-1;i++){
    //         if(i==0 && arr[i]>arr[i+1]){
    //             return arr[i];
    //         }
    //         else if(i!=0 && arr[i]>arr[i+1] && arr[i]>arr[i-1]){
    //             return arr[i];
    //         }
    //     }
        
    //     return -1;
    // }

    // --------------------------------------

    // Optimized approach

    public static int findPeakElement(int arr[]){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0 || arr[mid]>arr[mid-1]) && (mid==arr.length-1 || arr[mid]>arr[mid+1])){
                return mid;
            }
            else if(mid>0 && arr[mid-1]>arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    // time complexity : O(logn)
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=findPeakElement(arr);
        System.out.println(" The index of peak element is " + ans);
        sc.close();
    }
}
