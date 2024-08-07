package myName.arrays;
import java.util.Scanner;
public class linearSearch {

    public static int isPresent(int arr[],int x){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==x){
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements inside an array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to search");
        int x=sc.nextInt();
        int res=isPresent(arr,x);
        System.out.println("element found at index " + res);
        sc.close();
    }
}
