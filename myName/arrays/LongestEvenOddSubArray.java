package myName.arrays;
import java.util.Scanner;
public class LongestEvenOddSubArray {

    // NAIVE APPROACH

    // public static int lengthOfMaximumEvenOddSubarray(int arr[]){
    //     int length=1;
    //     for(int i=0;i<arr.length;i++){
    //         int currentElement=1;
    //         for(int j=i+1;j<arr.length;j++){
    //             if((arr[j]%2==0 && arr[j-1]!=0) || (arr[j]%2!=0 && arr[j-1]%2==0)){
    //                 currentElement++;
    //             }
    //         }
    //         length=Math.max(length,currentElement);
    //     }
    //     return length;

    // BETTER APPROACH
    
    public static int lengthOfMaximumEvenOddSubarray(int arr[]){
        int length=1;
        int maxlength=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]%2==0){
                length++;
            }  // [5,10,20,6,3,8]    
            else{
                length=1;
            }
            maxlength=Math.max(maxlength, length);
        }
        return maxlength;
    }

    // public static int lengthOfMaximumEvenOddSubarray(int arr[]){
    //     int Max=1;
    //     int count;
    //     int j;
    //     for(int i=1;i<arr.length;i++){
    //         count=1;
    //         j=i;
    //         if(arr[i]%2==0){
    //             while((arr[i-1]%2!=0 && arr[i]%2==0) || (arr[i-1]%2==0  && arr[i]%2!=0)){
    //                 count++;
    //                 i++;
    //                 if(i==arr.length){
    //                     break;
    //                 }
    //             }
    //         }
    //         else{
    //             while((arr[i-1]%2==0 && arr[i]%2!=0) || (arr[i]%2==0 && arr[i-1]%2!=0)){
    //                 count++;
    //                 i++;
    //                 if(i==arr.length){
    //                     break;
    //                 }
    //             }
    //         }
    //         Max=Math.max(Max,count);
    //         count=1;
    //         i=j;
            
    //     }
    //     return Max;

    //     // time complexity - O(n)
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int length=lengthOfMaximumEvenOddSubarray(arr);
        System.out.println("the length of maximum longest evenodd subarray is " + length);
        sc.close();
    }
}
