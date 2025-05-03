package myName.Hashing;
import java.util.Scanner;
import java.util.HashSet;
public class SubArraySumEqualsToK {

    public static boolean isSubarraySumEquals_k(int arr[],int k){
        HashSet<Integer> h = new HashSet<Integer>();
        int prefix_sum=0;
        for(int i=0;i<arr.length;i++){
            prefix_sum=prefix_sum+arr[i];
            if(h.contains(prefix_sum - k)){
                return true;
            }
            if(prefix_sum==k){
                return true;
            }
            h.add(prefix_sum);
        }
        return false;
        // time complexity : O(N)
        // Auxiliary space : O(N)
    }
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
        boolean ans=isSubarraySumEquals_k(arr,k);
        System.out.println(ans);
        sc.close();
    }
}
