package myName.searching;
import java.util.Scanner;
public class SearchInRotatedSortedArray {

    public static int searchIndex(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=x && x<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<x && x<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
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
        System.out.println("enter the element you want you search");
        int x=sc.nextInt();
        int res=searchIndex(arr,x);
        System.out.println("The element " + x + "is found at index: " + res);
        sc.close();
    }
}
