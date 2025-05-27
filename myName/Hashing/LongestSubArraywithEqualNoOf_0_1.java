package myName.Hashing;
import java.util.Scanner;
import java.util.HashMap;
public class LongestSubArraywithEqualNoOf_0_1 {

    // NAIVE SOLUTION 

    // public static int LongestEqualNo_Of_0_1_subarray(int arr[]){
    //     int max=0;
    //     for(int i=0;i<arr.length;i++){
    //         int count_1=0,count_0=0;
    //         for(int j=i;j<arr.length;j++){
    //             if(arr[j]==1){
    //                 count_1++;
    //             }
    //             if(arr[j]==0){
    //                 count_0++;
    //             }
    //             if(count_0==count_1){
    //                 max=Math.max(max,j-i+1);
    //             }
    //         }
    //     }
    //     return max;
    // }

    // OPTIMAL SOLUTION

    public static int LongestEqualNo_Of_0_1_subarray(int arr[]){
        int res=0;
        int prefix_sum=0; // we will treat 0 as -1 and 1 as +1
        // so that we can use prefix sum to find the longest subarray with equal no of 0 and 1
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=-1; // converting 0 to -1
            }
        }
        HashMap<Integer,Integer> h = new HashMap<>(); // to store the first occurrence of each prefix sum
        // if prefix_sum is 0, it means we have found a subarray with equal no of 0 and 1
        for(int i=0;i<arr.length;i++){
            prefix_sum=prefix_sum+arr[i];
            if(prefix_sum==0){ // if prefix_sum is 0, it means we have found a subarray with equal no of 0 and 1
                // from index 0 to i, we have found a subarray with equal no of 0 and 1
                res=i+1;
            }
            if(h.containsKey(prefix_sum)==false){ // we store the first occurrence of each prefix sum
                // we only store the first occurrence of each prefix sum to get the longest subarray
                h.put(prefix_sum, i);
            }
            if(h.containsKey(prefix_sum)){ // if we have seen this prefix_sum before, it means we have found a subarray with equal no of 0 and 1
                // from the first occurrence of this prefix_sum to the current index i, we have found a subarray with equal no of 0 and 1
                res=Math.max(res,i-h.get(prefix_sum)); // we calculate the length of the subarray
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements inside binary array");
        for(int i=0;i<arr.length;i++){
            int val=sc.nextInt();
            if(val!=0 && val!=1){
                System.out.println("invalid numbers . enter 0 or 1 only");
                sc.close();
                return; // exit the program
            }
            arr[i]=val;
        }
        int res=LongestEqualNo_Of_0_1_subarray(arr);
        System.out.println("the longest subarray with equal no of 0 and 1 is " + res);
        sc.close();
    }
}
