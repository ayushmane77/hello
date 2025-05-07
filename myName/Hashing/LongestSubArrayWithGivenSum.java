package myName.Hashing;
import java.util.HashMap;
import java.util.Scanner;
public class LongestSubArrayWithGivenSum {

    // public static int longest_sub_array_with_givenSum(int arr[], int k){
    //     int max=0;

    //     for(int i=0;i<arr.length;i++){
    //         int current_sum=0;
    //         for(int j=i;j<arr.length;j++){
    //             current_sum = current_sum + arr[j];
    //             if(current_sum==k){
    //                 max=Math.max(max,j-i+1);
    //             }
    //         }
    //     }
    //     return max;
    // }

    // time complexity : O(n^2)

    public static int longest_sub_array_with_givenSum(int arr[],int k){
        int res=0;
        int prefix_sum=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefix_sum=prefix_sum+arr[i];
            if(prefix_sum==k){
                res=i+1;
            }
            if(h.containsKey(prefix_sum)==false){
                h.put(prefix_sum,i);
            }
            if(h.containsKey(prefix_sum-k)){
                res=Math.max(res,i-h.get(prefix_sum-k));
            }
        }
        return res;
    }
    // time complexity : O(N)
    // auxiliary space : O(N)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the targeted sum");
        int k = sc.nextInt();
        int ans=longest_sub_array_with_givenSum(arr,k);
        System.out.println("the longest subarray length is " + ans);
        sc.close();
    }
}
