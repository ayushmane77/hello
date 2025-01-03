package myName.sorting;
import java.util.Scanner;
public class InsertionSort {
    public static int[] SortingByInsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){  // starting from 2nd element
            int key=arr[i]; // key is the element to be compared
            int j=i-1;      // j is the index of element just before key
            while(j>=0 && arr[j]>key){ // if element of arr is greater than key
                arr[j+1]=arr[j]; // shifting the element to right
                j--; // moving to left
            }
            arr[j+1]=key;   // inserting the key at correct position
        }
        return arr; // returning the sorted array
    }
    // Time complexity of Insertion Sort is O(n^2) in general, but O(n) in best case(when array is already sorted).
    // Space complexity of Insertion Sort is O(1).
    // Insertion Sort is stable.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SortingByInsertionSort(arr);
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
