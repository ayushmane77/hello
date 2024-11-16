package myName.searching;
import java.util.Scanner;
public class TripletSum {

    public static boolean findTripletSum(int arr[],int sum){
        for(int i=0;i<arr.length-2;i++){
            int currentSum=0;
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    currentSum=currentSum+arr[i]+arr[j]+arr[k];
                    if(currentSum==sum){
                        return true;
                    }
                    else{
                        currentSum=0;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target triplet sum");
        int sum=sc.nextInt();
        boolean ans=findTripletSum(arr,sum);
        System.out.println(ans);
        sc.close();
    }
}
