package myName.searching;
import java.util.Arrays;
import java.util.Scanner;
public class AgressiveCows {

    public static boolean isPossibleLargest(int arr[],int k,int minAllowedDistance){
        
        int cows=1;
        int lastStallPosition=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastStallPosition>=minAllowedDistance){
                lastStallPosition=arr[i];
                cows++;
            }
            if(cows==k){
                return true;
            }
        }

        return false;
    }

    public static int possibleLargestOfMinimumAllocation(int arr[],int k){
        int ans=-1;
        Arrays.sort(arr);
        int low=1;
        int high=arr[arr.length-1]-arr[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossibleLargest(arr,k,mid)){ // right
                ans=mid;
                low=mid+1;
            }
            else{   // left
                high=mid-1;
            }
        }
        return ans;
        // Time complexity: O(nlogn+nlogd)
        // O(nlogn) comes from sorting.
        // O(nlogd) comes from binary search.
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number of cows for allocation");
        int k=sc.nextInt();
        int ans=possibleLargestOfMinimumAllocation(arr,k);
        System.out.println(ans);
        sc.close();
    }
}
