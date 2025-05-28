package myName.Hashing;
import java.util.Scanner;
import java.util.HashMap;
public class LongestCommonBinarySubArray {

    // NAIVE SOLUTION
    // public static int longestSubArray(int arr[],int arr2[]){
    //     int max=0;
    //     for(int i=0;i<arr.length;i++){
    //         int leftSubArraySum=0;
    //         int rightSubArraySum=0;
    //         for(int j=i;j<arr.length;j++){
    //             leftSubArraySum=leftSubArraySum+arr[j];
    //             rightSubArraySum=rightSubArraySum+arr2[j];
    //             if(leftSubArraySum==rightSubArraySum){
    //                 max=Math.max(max,j-i+1);
    //             }
    //         }
    //     }
    //     return max;
    // }


    // OPTIMIZED SOLUTION 
    public static int longestSubArray(int arr[],int arr2[]){
        int max=0; // variable to store the maximum length of subarray with common sum
        // we will use a temporary array to store the difference between the two arrays
        int temp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i] - arr2[i]; // calculating the difference between the two arrays
        }
        int prefixSum=0;
        HashMap<Integer,Integer> h = new HashMap<>(); // HashMap to store the prefix sum and its index
        for(int j=0;j<temp.length;j++){
            prefixSum=prefixSum+temp[j];
            if(prefixSum==0){ // if the prefix sum is zero, it means the subarray from the start to j has a common sum
                // so we can update the max length to j+1
                max=j+1;
            }
            if(h.containsKey(prefixSum)==false){ // if the prefix sum is not present in the HashMap, we add it with its index
                // this is done to ensure that we get the longest subarray with common sum
                h.put(prefixSum,j);
            }
            if(h.containsKey((prefixSum))==true){ // if the prefix sum is already present in the HashMap, it means we have found a subarray with common sum
                // we can calculate the length of the subarray and update the max length if it is greater than the current max
                max=Math.max(max,j-h.get(prefixSum));
            }
        }
        return max; // returning the maximum length of subarray with common sum
    }

    // time complexity : O(N)
    // auxiliary space : O(N) + O(N)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the first binary array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements inside first binary array");
        for(int i=0;i<arr.length;i++){
            int val = sc.nextInt();
            if(val!=0 && val!=1){
                System.out.println("invalid input inside a binary array");
                sc.close();
                return;
            }
            arr[i]=val;
        }
        System.out.println("enter the size of the second binary array");
        int n2 = sc.nextInt();
        if(n!=n2){
            System.out.println("array size should be same as first array");
            sc.close();
            return;
        }
        int arr2[] = new int[n2];
        System.out.println("enter the elements inside second binary array");
        for(int i=0;i<arr2.length;i++){
            int val = sc.nextInt();
            if(val!=0 && val!=1){
                System.out.println("invalid input inside a binary array");
                sc.close();
                return;
            }
            arr2[i]=val;
        }
        int ans=longestSubArray(arr,arr2);
        System.out.println("the length of longest binary subarray with common sum is " + ans);
        sc.close();
    }
}
