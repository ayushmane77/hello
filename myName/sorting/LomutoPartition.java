package myName.sorting;
import java.util.Scanner;
public class LomutoPartition {
    public static void PartitionByLomuto(int arr[],int low,int high,int p){ // p is the index of pivot element
        int pivot=arr[p]; // pivot element
        arr[p]=arr[high]; // swapping pivot element with last element
        arr[high]=pivot; // pivot element is now at last index
        int i=low-1; // index of smaller element
        for(int j=low;j<=high-1;j++){ // traverse the array
            if(arr[j]<pivot){ // if current element is smaller than pivot
                i++; // increment index of smaller element
                int temp=arr[j]; // swap arr[i] and arr[j]
                arr[j]=arr[i]; // swap arr[i] and arr[j]
                arr[i]=temp; // swap arr[i] and arr[j]
            }
        }
        int temp = arr[i + 1]; // swap arr[i+1] and arr[high] (or pivot)
        arr[i + 1] = arr[high]; // swap arr[i+1] and arr[high] (or pivot)
        arr[high] = temp; // swap arr[i+1] and arr[high] (or pivot)
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
        System.out.println("enter the pivot element index");
        int p=sc.nextInt();
        int low=0;
        int high=n-1;
        PartitionByLomuto(arr,low,high,p);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
