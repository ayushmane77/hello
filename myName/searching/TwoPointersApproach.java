package myName.searching;
import java.util.Scanner;
public class TwoPointersApproach {

    // two pointer approach for finding whether a pair of element exist in  
    // in an inputed sorted array which have the same targeted input sum.

    // NOTE: Input array is sorted

    public static boolean isValidsum(int arr[],int sum){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            if(arr[low] + arr[high]==sum){
                return true;
            }
            else if(arr[low] + arr[high]<sum){
                low++;
            }
            else{
                high--;
            }
        }
        return false;
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
        System.out.println("enter the target sum");
        int sum=sc.nextInt();
        boolean ans=isValidsum(arr,sum);
        System.out.println(ans);
        sc.close();
    }
}
