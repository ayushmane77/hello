package myName.Hashing;
// import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class PairWithGivenSum {

    // public static boolean isPair(int arr[],int sum){
    //     Arrays.sort(arr);
    //     int low=0;
    //     int high=arr.length-1;
    //     while(low<high){
    //         if(arr[low] + arr[high] == sum){
    //             return true;
    //         }
    //         else if(arr[low] + arr[high] < sum){
    //             low++;
    //         }
    //         else{
    //             high--;
    //         }
    //     }
    //     return false;
    // } // Time complexity : O(nlogn)

    public static boolean isPair(int arr[],int sum){
        HashSet<Integer> h = new HashSet<Integer>();
        for(int x : arr){
            if(h.contains(sum-x)){
                return true;
            }
            h.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the targeted sum");
        int sum = sc.nextInt();
        boolean ans=isPair(arr,sum);
        System.out.println(ans);
        sc.close();
    }
}
