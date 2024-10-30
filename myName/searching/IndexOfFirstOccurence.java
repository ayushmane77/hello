package myName.searching;
import java.util.*;
public class IndexOfFirstOccurence {

    //-------------------------------------------------------------------------------
    
    // Naive approach

    // public static int firstOccurence(int arr[],int x){
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==x){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // Time complexity: O(N)

    //-----------------------------------------------------------------------------------
    // Optimized approach

    public static int firstOccurence(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                while(mid!=0 && arr[mid-1]==x){
                    mid--;
                }
                return mid;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    // Time complexity:O(logN)

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array in sorted way");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the element you want to search");
        int x=sc.nextInt();
        int res=firstOccurence(arr,x);
        System.out.println("the first occurence of " + x + " is " + res);
        sc.close();
    }
}
