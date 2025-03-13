package myName.sorting;
import java.util.Arrays;
import java.util.Scanner;
public class ChocolateDistribution {

    public static int minimumDistribution(int arr[],int k){
        if(k>arr.length){
            return -1;
        }
        Arrays.sort(arr);
        int low=0;
        int high=k-1;
        // int ans=Integer.MAX_VALUE;
        int diff=arr[high]-arr[low];
        for(int j=1;j<arr.length-k+1;j++){
            high++;
            diff=Math.min(diff,arr[high]-arr[j]);
        }
        return diff;

        // time complexity: O(nlogn)
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
        System.out.println("enter the number of childrens");
        int k=sc.nextInt();
        int ans=minimumDistribution(arr,k);
        System.out.println("the minimum difference in distribution of chocolates to " + k + "students is " + ans);
        sc.close();
    }
}
