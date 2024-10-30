package myName.searching;
import java.util.*;
public class IndexOfLastOccurence {

    public static int lastOccurence(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                if(mid==arr.length-1 || arr[mid+1]!=x){
                    return mid;
                }
                else{
                    low=mid+1;
                }
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the element you want to search");
        int x=sc.nextInt();
        int res=lastOccurence(arr,x);
        System.out.println("the last occurence of " + x + " is " + res);
        sc.close();
    }
}
