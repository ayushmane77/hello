package myName.sorting;
import java.util.Scanner;
public class QuickSortHoarePartition {

    public static void Sort(int arr[]){
        QuickSort(arr,0,arr.length-1);
    }
    public static void QuickSort(int arr[],int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            QuickSort(arr, low, p);
            QuickSort(arr, p+1, high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low-1;
        int j=high+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j){
                return j;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sort(arr);
        System.out.println("After sorting the array is:");
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
