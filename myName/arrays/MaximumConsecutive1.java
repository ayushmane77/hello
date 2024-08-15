package myName.arrays;
import java.util.Scanner;
public class MaximumConsecutive1 {

    public static int findMaximumConsecutive1(int arr[]){
        int maxCount=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            while(arr[i]==1){
                count++;
                i++;
                if(i==arr.length){
                    break;
                }
            }
            // if(maxCount<count){
            //     maxCount=count;
            // }
            // or
            maxCount=Math.max(maxCount, count);
            count=0;
        }
        return maxCount;
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
        int res=findMaximumConsecutive1(arr);
        System.out.println("the maximum consecutive of 1's are " + res);
        sc.close();
    }
}
