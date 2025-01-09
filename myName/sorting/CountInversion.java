package myName.sorting;
import java.util.Scanner;
public class CountInversion {

    // Naive solution
    // public static int Inversion(int arr[]){
    //     int count=0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]>arr[j]){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    // Time complexity is O(n^2)
    // Space complexity is O(1)
//-----------------------------------------
    // Optimized solution
    public static int merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1; // size of the left subarray
        int n2=high-mid;  // size of the right subarray
        int left[]=new int[n1]; // create the left subarray
        int right[]=new int[n2]; // create the right subarray
        for(int i=0;i<n1;i++){ // copy the element of the left subarray
            left[i]=arr[low+i]; // index of left subarray always start from low
        }
        for(int j=0;j<n2;j++){ // copy the element of the right subarray
            right[j]=arr[mid+1+j]; // index of right subarray always start from mid+1
        }
        int i=0,j=0,k=low,count=0; // i is the index of left subarray, j is the index of right subarray, k is the index of the main array
        while(i<n1 && j<n2){ // merge the left and right subarray
            if(left[i]<=right[j]){ // if the element of the left subarray is less than or equal to the element of the right subarray
                arr[k]=left[i]; // copy the element of the left subarray to the main array
                i++; // increment the index of the left subarray
                k++; // increment the index of the main array
            }
            else{
                arr[k]=right[j]; // copy the element of the right subarray to the main array
                j++; // increment the index of the right subarray
                k++; // increment the index of the main array
                count=count+(n1-i); // count the Inversion
            }
        }
        while(i<n1){ // if the left subarray has remaining elements
            arr[k]=left[i]; // copy the remaining elements of the left subarray to the main array
            i++; // increment the index of the left subarray
            k++; // increment the index of the main array
        }
        while(j<n2){ // if the right subarray has remaining elements
            arr[k]=right[j]; // copy the remaining elements of the right subarray to the main array
            j++; // increment the index of the right subarray
            k++; // increment the index of the main array
        }
        return count;
    }


    public static int Inversion(int arr[],int low,int high){
        int count=0; // count the number of Inversion
        if(low<high){ // if the array has more than one element
            int mid=(low+high)/2; // find the middle element
            count=count+Inversion(arr,low,mid); // count the Inversion of the left subarray
            count=count+Inversion(arr, mid+1, high); // count the Inversion of the right subarray
            count=count+merge(arr,low,mid,high); // count the Inversion of the merge subarray
        }
        return count; // return the total Inversion
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=Inversion(arr,0,n-1);
        System.out.println("the total Inversion is " + count);
        sc.close();
    }
}
