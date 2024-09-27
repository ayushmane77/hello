package myName.arrays;
import java.util.Scanner;
public class EquilibriumPoint {

    // public static boolean containsEquilibriumPoint(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         int leftSum=0;
    //         int rightSum=0;
    //         for(int j=0;j<i;j++){
    //             leftSum=leftSum+arr[j];
    //         }
    //         for(int k=i+1;k<arr.length;k++){
    //             rightSum=rightSum+arr[k];
    //         }
    //         if(leftSum==rightSum){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // Time complexity:- O(n2)
    //---------------------------------------------------------

    public static boolean containsEquilibriumPoint(int arr[]){
        int rightSum=0;
        for(int i=0;i<arr.length;i++){
            rightSum=rightSum+arr[i];
        }
        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            rightSum=rightSum-arr[i];
            if(leftSum==rightSum){
                return true;
            }
            leftSum=leftSum+arr[i];
        }
        return false;
    }

    // Time Complexity: O(N)
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean res=containsEquilibriumPoint(arr);
        System.out.println(res);
        sc.close();
    }
}
