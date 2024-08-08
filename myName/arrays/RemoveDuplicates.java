package myName.arrays;
import java.util.Scanner;
public class RemoveDuplicates {

    public static int removeDuplicates(int arr[]){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[res-1]!=arr[i]){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements in a sorted way");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=removeDuplicates(arr);
        System.out.println(res);
        sc.close();
    }
}
