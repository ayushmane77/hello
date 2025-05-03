package myName.Hashing;
import java.util.HashSet;
import java.util.Scanner;
public class SubArrayWithGivenSum {

    // public static boolean isSubArraySumEquals_0(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         int current_sum=0;
    //         for(int j=i;j<arr.length;j++){
    //             current_sum=current_sum+arr[j];
    //             if(current_sum==0){
    //                 return true;
    //             }
    //         }
    //     }
    //     // time complexity : O(N^2)
    //     return false;
    // }

    public static boolean isSubArraySumEquals_0(int arr[]){
        int prefix_sum=0;
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            prefix_sum=prefix_sum+arr[i];
            if(h.contains(prefix_sum)){
                return true;
            }
            if(prefix_sum==0){
                return true;
            }
            h.add(prefix_sum);
        }
        return false;
    }
    // time complexity : O(N)
    // Auxiliary space : O(N)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean ans=isSubArraySumEquals_0(arr);
        System.out.println(ans);
        sc.close();
    }
}
