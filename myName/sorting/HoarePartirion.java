package myName.sorting;
import java.util.Scanner;
public class HoarePartirion {

    public static int PartitionByHoare(int arr[]){
        int low=0; // low is the first index of array
        int high=arr.length-1; // high is the last index of array
        int i=low-1; // i is the index of smaller element
        int j=high+1; // j is the index of larger element
        int pivot=arr[low]; // pivot is the first element of array
        while(true){ // infinite loop
            do{         // increment i until arr[i] is less than pivot
                i++;    // increment i
            }while(arr[i]<pivot); // check the condition

            do{        // decrement j until arr[j] is greater than pivot
                j--;   // decrement j
            }while(arr[j]>pivot); // check the condition
            if(i>=j){       // if i is greater than or equal to j then return j
                return j;    // return j
            }
            int temp=arr[i];  // swap the elements
            arr[i]=arr[j];    // swap the elements
            arr[j]=temp;      // swap the elements
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
        
        int j=PartitionByHoare(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("the pivot index is " + j);
        sc.close();
    }
}
