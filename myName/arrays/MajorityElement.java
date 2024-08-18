package myName.arrays;
import java.util.Scanner;
public class MajorityElement {

    public static int majorityElement(int arr[]){
        // [3,8,4,8,8]
        if(arr.length==1){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>arr.length/2){
                    return i;
                }
            }
        }
        return -1;
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
        int res=majorityElement(arr);
        System.out.println("the majority element's index in the array is " + res);
        sc.close();
    }
}
