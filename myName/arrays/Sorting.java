package myName.arrays;
import java.util.Scanner;
public class Sorting {

    public static void sorting(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("this is the sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("the second largest is " + arr[arr.length-2]);
        // return arr.length-2;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        if(n<=1){
            System.out.println("enter more than 1 elements");
        }
        else{
            System.out.println("enter the elements inside array");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            sorting(arr);
            // System.out.println(res);
        }
        sc.close();
    }
}
