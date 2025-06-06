package myName.Hashing;
import java.util.HashMap;
import java.util.Scanner;
public class CountOfZeroSumSubarray {

    // NAIVE SOLUTION
    // public static int TotalCountOfZeroSumSubArray(int arr[]){
    //     int count = 0;
    //     for(int i=0;i<arr.length;i++){
    //         int sum=0;
    //         for(int j=i;j<arr.length;j++){
    //             sum = sum + arr[j];
    //             if(sum==0){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    // time complexity : O(N^2)

    // Optimal solution
    public static int TotalCountOfZeroSumSubArray(int arr[]){
        int count = 0; // Initialize count of zero-sum subarrays
        // Using a HashMap to store the frequency of prefix sums
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,1);  // Initialize the map with a prefix sum of 0, which accounts for subarrays that sum to 0 from the start
        // Initialize prefix sum to 0
        int prefixSum = 0;
        for(int x : arr){
            prefixSum = prefixSum + x;     // Update the prefix sum with the current element
            if(h.containsKey(prefixSum)){ // Check if this prefix sum has been seen before
                // If it has, it means there are subarrays that sum to 0
                count = count + h.get(prefixSum);  // Increment count by the number of times this prefix sum has occurred
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
        int res=TotalCountOfZeroSumSubArray(arr);
        System.out.println("the total no of subarray with sum equal to 0 is " + res);
        sc.close();
    }
}
