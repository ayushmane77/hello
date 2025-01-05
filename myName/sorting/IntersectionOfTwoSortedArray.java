package myName.sorting;
import java.util.Scanner;
public class IntersectionOfTwoSortedArray {
    // Naive approach
    // public static void CommonElements(int arr1[],int arr2[]){
    //     if(arr1.length>arr2.length){ // to make sure that arr1 is always smaller than arr2
    //         CommonElements(arr2, arr1); // if arr1 is greater than arr2 then we will swap the arrays
    //     }
    //     int previousElement=-1; // to keep track of the previous element
    //     for(int i=0;i<arr1.length;i++){ // we will iterate through the first array
    //         for(int j=0;j<arr2.length;j++){ // we will iterate through the second array
    //             if(arr1[i]==arr2[j] && previousElement!=arr1[i]){ // if the element in the first array is equal to the element in the second array and the previous element is not equal to the current element
    //                 System.out.print(arr1[i] + " "); // then we will print the element
    //                 previousElement=arr1[i]; // and update the previous element
    //             }
    //         }
    //     } 
    // }
    // Time complexity is O(n*m) where n is the size of the first array and m is the size of the second array
    // Space complexity is O(1)

   //--------------------------------------------------------------

    // Efficient approach

    public static void CommonElements(int arr1[],int arr2[]){
        int i=0; // to keep track of the first array
        int j=0; // to keep track of the second array
        int previousElement=Integer.MIN_VALUE; // to keep track of the previous element
        while(i<arr1.length && j<arr2.length){ // we will iterate through the arrays until we reach the end of any of the arrays
            if(arr1[i]==arr2[j] && previousElement!=arr1[i]){ // if the element in the first array is equal to the element in the second array and the previous element is not equal to the current element
                System.out.print(arr1[i] + " "); // then we will print the element
                previousElement=arr1[i]; // and update the previous element
                i++; // we will increment the first array
                j++; // we will increment the second array
            }
            else if(arr1[i]<arr2[j]){ // if the element in the first array is less than the element in the second array
                i++; // we will increment the first array
            }
            else{ // if the element in the first array is greater than the element in the second array
                j++; // we will increment the second array
            }
        }
    }
    // time complexity is O(n+m) where n is the size of the first array and m is the size of the second array
    // space complexity is O(1)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("enter the size of second array");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("enter the elements inside first array");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the elements inside second array");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        CommonElements(arr1,arr2);
        sc.close();
    }
}
