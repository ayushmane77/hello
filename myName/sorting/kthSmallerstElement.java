package myName.sorting;
// import java.util.Arrays;
import java.util.Scanner;
public class kthSmallerstElement {

    // naive solution
    // public static int ksmallestElement(int arr[],int k){
    //     Arrays.sort(arr);
    //     return (k>arr.length)?-1:arr[k-1];
    // }

    // optimized solution

    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<arr.length;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp2=pivot;
        arr[high]=arr[i+1];
        arr[i+1]=temp2;
        return i+1;
    }

    public static int ksmallestElement(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int p=partition(arr,low,high);
            if(p==k-1){
                return arr[p];
            }
            else if(p>k-1){
                high=p-1;
            }
            else{
                low=p+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        int ans=ksmallestElement(arr,k);
        System.out.println("the " + k +"th smallest element in the array is " + ans);
        sc.close();
    }
}
