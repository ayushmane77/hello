package myName.sorting;
import java.util.Scanner;
public class StandardMergeSort {

    public static void merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1; // size of left array
        int n2=high-mid; // size of right array
        int a[]=new int[n1]; // declaring left array
        int b[]=new int[n2]; // declaring right array
        for(int i=0;i<n1;i++){ // copying elements to left array
            a[i]=arr[low+i]; // copying elements from low to mid
        }
        for(int j=0;j<n2;j++){ // copying elements to right array
            b[j]=arr[mid+1+j]; // copying elements from mid+1 to high
        }
        int i=0,j=0,k=low; // i for left array, j for right array and k for main array
        while(i<n1 && j<n2){ 
            if(a[i]<=b[j]){ // if element of left array is smaller than element of right array
                arr[k]=a[i]; // copying the smaller element to main array
                i++; // moving to next element of left array
                k++; // moving to next element of main array
            }
            else{ // if element of right array is smaller than element of left array
                arr[k]=b[j]; // copying the smaller element to main array
                j++; // moving to next element of right array
                k++; // moving to next element of main array
            }
        }
        while(i<n1){ // if there are still elements left in left array
            arr[k]=a[i]; // copying the remaining elements to main array
            i++; // moving to next element of left array
            k++; // moving to next element of main array
        }
        while(j<n2){ // if there are still elements left in right array
            arr[k]=b[j]; // copying the remaining elements to main array
            j++; // moving to next element of right array
            k++; // moving to next element of main array
        }
    }

    public static void mergeSort(int arr[],int low,int high){
        if(low<high){ // if there are more than 1 elements in the array
            int mid=(low+high)/2; // finding the middle element
            mergeSort(arr, low, mid); // sorting the left half of the array
            mergeSort(arr, mid+1, high); // sorting the right half of the array
            merge(arr,low,mid,high); // merging the two halves
        }
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
        mergeSort(arr,0,arr.length-1);
        System.out.println("The sorted array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
