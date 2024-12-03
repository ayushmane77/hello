package myName.searching;
import java.util.Arrays;
import java.util.Scanner;
public class RepeatingElements {
    // super naive solution

    // public static int findRepeatingElement(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 return arr[i];
    //             }
    //         }
    //     }
    //     return -1;
    // }
    // Time complexity: O(n^2)
    //----------------------------------------------------

    // Naive solution

    // public static int findRepeatingElement(int arr[]){
    //     Arrays.sort(arr);
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]==arr[i+1]){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }
    // Time complexity: O(nlogn)

    // ------------------------------------------------------

    // Efficient approach

    public static int findRepeatingElement(int arr[]){
        boolean temp[]=new boolean[arr.length];
        Arrays.fill(temp, false);
        for(int i=0;i<arr.length;i++){
            if(temp[arr[i]]){
                return arr[i];
            }
            temp[arr[i]]=true;
        }
        return -1;
    }

    // Time Complexity: O(n)
    // Auxiliary Space: O(n)

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=findRepeatingElement(arr);
        System.out.println("the repeating element is " + ans);
        sc.close();
    }
}
