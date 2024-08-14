package myName.arrays;
import java.util.Scanner;
public class Frequencies {

// only for sorted array

//   NAIVE APPROACH

    // public static void calculateFrequencies(int arr[]){
    //     // // int trial=10; just to show , not a part of code
    //     boolean flag=false;
    //     for(int i=0;i<arr.length;i++){
    //         int count=1;
    //         if(flag==true || i==0){
    //             for(int j=i+1;j<arr.length;j++){
    //                 if(arr[i]==arr[j]){
    //                     count++;
                        
    //                 }
    //             }
    //             System.out.println("the count of " + arr[i] + " is " + count);
    //         }
    //         if(i==arr.length-1){
    //             break;
    //         }
    //         if(arr[i]!=arr[i+1]){
    //             flag=true;
    //         }
    //         else{
    //             flag=false;
    //         }
            
    //        // // trial=trial+10; just to show , not a part of code
    //     }
    // }

    // BETTER APPROACH

    public static void calculateFrequencies(int arr[]){
        int freq=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                freq++;
            }
            else{
                System.out.println("the frequency of " + arr[i-1] + " is " + freq);
                freq=1;
            }
        }
        System.out.println("the frequecy of " + arr[arr.length-1] + " is " + freq);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        calculateFrequencies(arr);
        sc.close();
    }
}
