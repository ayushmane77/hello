package myName.arrays;
import java.util.Scanner;
public class ReverseArray {
    public static int[] reverseArray(int arr[]){
        int start=0,end=arr.length-1;
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res[]=reverseArray(arr);
        System.out.println("the reversed array is ");
        for(int j=0;j<n;j++){
            System.out.print(res[j] + " ");
        }
        sc.close();
    }
}
