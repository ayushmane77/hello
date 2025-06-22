package myName.sorting;
import java.util.Scanner;
public class SelectionSort {
    // public static int[] SortingBySelectionSort(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         // int min=arr[i];
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[j]<arr[i]){ 
    //                 int temp=arr[j]; 
    //                 arr[j]=arr[i]; 
    //                 arr[i]=temp;   // [2,5,7,8,9]
    //             }
    //         }
    //     }
    //     return arr;
    // }
    // Time complexity of Selection Sort is O(n^2) in all cases.
    // Space complexity of Selection Sort is O(1).
    // Selection Sort is not stable.

    // OR
    public static int[] SortingBySelectionSort(int arr[]){  // [34,12,55,65,23]
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){       // Store the minimum index seen so far and compare it with rest elements 
                    min = j;
                }
            }
            int temp = arr[i];  // swap the current ith element with the element of minimum index.
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    // Time complexity : O(N^2)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n]; 
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SortingBySelectionSort(arr);
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
