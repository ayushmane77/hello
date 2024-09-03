package myName.arrays;
import java.util.Scanner;
public class SubArray {

    public static void givenSum(int arr[],int targetSum){
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                if(currentSum==targetSum){
                    System.out.println("YES");
                    return;
                }
                currentSum=currentSum+arr[j];
            }
        }
            System.out.println("NO");
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
        System.out.println("enter the sum to be checked in array");
        int targetSum=sc.nextInt();
        givenSum(arr,targetSum);
        sc.close();
    }
}
