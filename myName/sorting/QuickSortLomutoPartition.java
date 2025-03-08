package myName.sorting;
import java.util.Scanner;
public class QuickSortLomutoPartition {

    public static void Sorting(int arr[]){ // function to sort the array
        int low=0; // starting index
        int high=arr.length-1; // ending index
        QuickSort(arr,low,high); // calling QuickSort function
    }
    public static void QuickSort(int arr[],int low,int high){ // function to sort the array
        if(low<high){ // if low is less than high
            int p=lomuto(arr,low,high); // p is the partitioning index
            QuickSort(arr, low, p-1); // sort elements before partition
            QuickSort(arr, p+1, high); // sort elements after partition
        }
    }
    public static int lomuto(int arr[],int low,int high){ // function to partition the array
        int pivot=arr[high]; // pivot element
        int i=low-1; // index of smaller element
        for(int j=low;j<arr.length;j++){
            if(arr[j]<pivot){ // if current element is smaller than pivot
                i++;           // increment index of smaller element
                int temp=arr[j]; // swap arr[i] and arr[j]
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp2=arr[i+1]; // swap arr[i+1] and arr[high] (or pivot)
        arr[i+1]=pivot;
        arr[high]=temp2;
        return i+1; // return the partitioning index
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside arrays");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sorting(arr);
        System.out.println("the array after sorting is");
        for(int x:arr){
            System.out.println(x);
        }
        sc.close();
    }
}
