package myName.Hashing;
import java.util.HashMap;
import java.util.Scanner;
public class CountOfSubArraySumEqualToK {

    // Naive solution
    // public static int TotalCountOfSubArraysSumEqualToK(int arr[],int k){
    //     int count=0;
    //     for(int i=0;i<arr.length;i++){
    //         int sum=0;
    //         for(int j=i;j<arr.length;j++){
    //             sum = sum + arr[j];
    //             if(sum==k){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    // Time complexity : O(N^2)


    // Optimized solution
    public static int TotalCountOfSubArraysSumEqualToK(int arr[],int k){
        int count = 0; // Initialize count of subarrays with sum equal to k
        HashMap<Integer,Integer> h = new HashMap<>();// Using a HashMap to store the frequency of prefix sums
        h.put(0,1);// Initialize the map with a prefix sum of 0, which accounts for subarrays that sum to k from the start
        int prefixSum = 0;// Initialize prefix sum to 0
        for(int x: arr){
            prefixSum = prefixSum + x; // Update the prefix sum with the current element
            if(h.containsKey(prefixSum-k)){// Check if there exists a prefix sum such that the difference with the current prefix sum equals k
                // If such a prefix sum exists, it means there are subarrays that sum to k

                count = count + h.get(prefixSum-k); // Increment count by the number of times this prefix sum has occurred
            }
            h.put(prefixSum,h.getOrDefault(prefixSum, 0)+1); // Update the frequency of the current prefix sum in the HashMap
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the targeted subarray sum ");
        int k = sc.nextInt();
        int res=TotalCountOfSubArraysSumEqualToK(arr,k);
        System.out.println("the total no of subArrays sum equal to " + k + " is " + res);
        sc.close();
    }
}
