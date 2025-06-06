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
        int count = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,1);
        int prefixSum = 0;
        for(int x: arr){
            prefixSum = prefixSum + x;
            if(h.containsKey(prefixSum-k)){
                count = count + h.get(prefixSum-k);
            }
            h.put(prefixSum,h.getOrDefault(prefixSum, 0)+1);
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
