package myName.arrays;
import java.util.Scanner;
public class lightIntensities {
    // you are given an integer array and an integer T. You have to find the number of intensities in the array which are less than or equal to T.

    public static int countIntensities(int arr[],int T){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=T){
                while(i<arr.length && arr[i]<=T){
                    i++;
                }
                count++;
            }
        }
        return count;
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
        System.out.println("enter the threeshold value");
        int T=sc.nextInt();
        int count=countIntensities(arr,T);
        System.out.println(count);
        sc.close();
    }
}
