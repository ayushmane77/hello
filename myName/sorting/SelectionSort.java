package myName.sorting;
import java.util.Scanner;
public class SelectionSort {
    public static int[] SortingBySelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            // int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){ 
                    int temp=arr[j]; 
                    arr[j]=arr[i]; 
                    arr[i]=temp;   // [2,5,7,8,9]
                }
            }
        }
        return arr;
    }
    // Time complexity of Selection Sort is O(n^2) in all cases.
    // Space complexity of Selection Sort is O(1).
    // Selection Sort is not stable.

    // OR
    // public static int[] SortingBySelectionSort(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         int min=arr[i];
    //         int minIndex=i;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[j]<min){
    //                 min=arr[j];
    //                 minIndex=j;
    //             }
    //         }
    //         int temp=arr[i];
    //         arr[i]=arr[minIndex];
    //         arr[minIndex]=temp;
    //     }
    //     return arr;
    // }
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
