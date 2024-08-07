package myName.arrays;
import java.util.Scanner;
public class SecondLargest {

    public static int secondLargest(int arr[]){
        int largest=0;
        int seclargest=-1;
        for(int i=1;i<arr.length;i++){  // [23,32,41,22,15]
            if(arr[i]>arr[largest]){
                seclargest=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest]){
                if(seclargest==-1 || arr[i]>arr[seclargest]){
                    seclargest=i;
                }
            }
        }
        return seclargest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements inside array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=secondLargest(arr);
        System.out.println(res);
        sc.close();
    }
}
