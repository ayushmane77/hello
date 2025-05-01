package myName.sorting;
import java.util.Scanner;
public class UnionOfTwoSortedArrays {

    public static void findUnion(int arr1[],int arr2[]){
        int i=0,j=0; // i for arr1 and j for arr2
        int previousElement=Integer.MIN_VALUE; // to keep track of previous element
        while(i<arr1.length && j<arr2.length){ // while both arrays have elements
            if(arr1[i]==arr2[j]){ // if both elements are equal
                if(previousElement!=arr1[i]){ // if previous element is not equal to current element
                    System.out.print(arr1[i] + " "); // print the element
                    previousElement=arr1[i]; // update the previous element
                }
                i++; // move to next element of arr1
                j++; // move to next element of arr2
            }
            else if(arr1[i]<arr2[j]){ // if element of arr1 is smaller than element of arr2
                if(previousElement!=arr1[i]){ // if previous element is not equal to current element
                    System.out.print(arr1[i] + " "); // print the element
                    previousElement=arr1[i]; // update the previous element
                }
                i++; // move to next element of arr1
            }
            else{ // if element of arr2 is smaller than element of arr1
                if(previousElement!=arr2[j]){ // if previous element is not equal to current element
                    System.out.print(arr2[j] + " "); // print the element
                    previousElement=arr2[j]; // update the previous element
                }
                j++; // move to next element of arr2
            }
        }
        while(i<arr1.length){
            if(arr1[i]!=previousElement){
                System.out.print(arr1[i] + " ");
                previousElement=arr1[i];
            }
            i++;
        }
        while(j<arr2.length){
            if(arr2[j]!=previousElement){
                System.out.print(arr2[j] + " ");
                previousElement=arr2[j];
            }
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("enter the elements inside first array in sorted order");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the size of second array");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("enter the elements inside second array in sorted order");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        findUnion(arr1,arr2);
        sc.close();
    }
}
