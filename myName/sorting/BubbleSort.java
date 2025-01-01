package myName.sorting;
import java.util.Scanner;
public class BubbleSort {

    public static int[] SortingByBubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){ // We need to do n-1 passes to sort the array.
            boolean isSwapped=false; // To check if any swapping is done in the current pass.
            for(int j=0;j<arr.length-1-i;j++){ // The last i elements are already sorted so no need to check them.
                if(arr[j]>arr[j+1]){ // If the current element is greater than the next element then swap them.
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true; // If any swapping is done then isSwapped will be true.
                }
            }
            if(isSwapped==false){ // If the array is already sorted then no need to check further.
                break;
            }
        }
        return arr;
    }
    // Time complexity of Bubble Sort is O(n^2) in worst case.
    // Space complexity of Bubble Sort is O(1).
    // Bubble Sort is stable.
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SortingByBubbleSort(arr);
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
