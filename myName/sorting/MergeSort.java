package myName.sorting;
// import java.util.*;
import java.util.Scanner;
public class MergeSort {

    // Naive solution

    // public static int[] SortingByMergeSort(int arr3[]){
    //     Arrays.sort(arr3);
    //     return arr3;
    // }
    // public static void main(String[] args) {
    //     try (Scanner sc = new Scanner(System.in)) {
    //         System.out.println("Enter the size of first array");
    //         int n1=sc.nextInt();
    //         int arr[]=new int[n1];
    //         System.out.println("Enter the elements of the first array");
    //         for(int i=0;i<n1;i++){
    //             arr[i]=sc.nextInt();
    //         }
    //         System.out.println("Enter the size of second array");
    //         int n2=sc.nextInt();
    //         int arr2[]=new int[n2];
    //         System.out.println("Enter the elements of the second array");
    //         for(int i=0;i<n2;i++){
    //             arr2[i]=sc.nextInt();
    //         }
    //         int arr3[]=new int[n1+n2];
    //         int i;
    //         for(i=0;i<arr.length;i++){
    //             arr3[i]=arr[i];
    //         }
    //         int k=0;
    //         for(int j=i;k<arr2.length;j++){
    //             arr3[j]=arr2[k];
    //             k++;
    //         }
    //         SortingByMergeSort(arr3);
    //         for(int j=0;j<arr3.length;j++){
    //             System.out.print(arr3[j] + " ");
    //         }
            
    //         for(int j=0;j<arr3.length;j++){
    //             System.out.print(arr3[j] + " ");
    //         }
    //         sc.close();
    //     }   
    // }

    public static void SortingByMergeSort(int arr[],int arr2[]){
        int i=0,j=0; // i for arr and j for arr2
        while(i<arr.length && j<arr2.length){
            if(arr[i]<=arr2[j]){ // if element of arr is smaller than element of arr2
                System.out.print(arr[i] + " "); // printing the smaller element
                i++; // moving to next element of arr
            }
            else{
                System.out.print(arr2[j] + " "); // printing the smaller element
                j++; // moving to next element of arr2
            }
        }
        while(i<arr.length){ // if arr2 is exhausted
            System.out.print(arr[i] + " "); // printing remaining elements of arr
            i++;
        }
        while(j<arr2.length){ // if arr is exhausted
            System.out.print(arr2[j] + " "); // printing remaining elements of arr2
            j++;
        }
    }
    // Time complexity of Merge Sort is O(n+m) where n is the size of first array and m is the size of second array.
    // Space complexity of Merge Sort is O(1).
    // Merge Sort is stable.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        System.out.println("enter elements inside first array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the size of second array");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("enter elements inside second array");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        SortingByMergeSort(arr,arr2);
        sc.close();
    }
}
