package myName.searching;
import java.util.*;
public class countOccurences {

    // efficient approach
    public static int firstOccurence(int arr[],int x,int mid){
        int count=1;
        while(mid!=0 && arr[mid-1]==x){
            mid--;
            count++;
        }
        return count;
    }

    public static int lastOccurence(int arr[],int x,int mid){
        int count=0;
        while(mid!=arr.length-1 && arr[mid+1]==x){
            mid++;
            count++;
        }
        return count;
    }

    public static int findOccurence(int arr[],int x){
        int count=0;
        // Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                int first=firstOccurence(arr,x,mid);
                int last=lastOccurence(arr,x,mid);
                return last+first;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return count;
    }

    // time complexity : O(logn)

    // another approach
     
    // public static int findOccurence(int arr[],int x){
    //     int count = 0;
    //     int low = 0;
    //     int high = arr.length-1;
    //     while(low<=high){
    //         int mid =  (low + high)/2;
    //             if(arr[mid]==x){
    //                 count++;
    //                 int i = mid;
    //                 int j = mid;
    //                 while(i!=0 && arr[i-1]==x){
    //                     count++;
    //                     i--;
    //                 }
    //                 while(j!=arr.length-1 && arr[j+1]==x){
    //                     count++;
    //                     j++;
    //                 }
    //                 return count;
    //             }
    //             else if(arr[mid]<x){
    //                 low = mid + 1;
    //             }
    //             else{
    //                 high = mid - 1;
    //             }
    //     }
    //     return count;
    // }

    // time complexity : O(logn + k) where k is the number of occurences
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to find its occurence");
        int x=sc.nextInt();
        int res=findOccurence(arr,x);
        System.out.println("The number of occurence of " + x + " is " + res);
        sc.close();
    }
}
