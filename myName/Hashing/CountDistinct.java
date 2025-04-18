package myName.Hashing;
import java.util.HashSet;
import java.util.Scanner;
public class CountDistinct {

    // naive solution

    // public static int distinct(int arr[]){
    //     int res=0;
    //     for(int i=0;i<arr.length;i++){
    //         boolean flag=true;
    //         for(int j=0;j<i;j++){
    //             if(arr[i]==arr[j]){
    //                 flag=false;
    //                 break;
    //             }
    //         }
    //         if(flag){
    //             res++;
    //         }
    //     }
    //     return res;
    // }

    // optimized solution
    public static int distinct(int arr[]){
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        return h.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans=distinct(arr);
        System.out.println("the number of distinct elements is " + ans);
        sc.close();
    }
}
