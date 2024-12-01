package myName.searching;
import java.util.*;
public class MedianOfTwoSortedArray {

    public static float findMedian(int arr1[],int arr2[]){
        int temp[]=new int[arr1.length+arr2.length];
        int i;
        for(i=0;i<arr1.length;i++){
            temp[i]=arr1[i];
        }
        int k=i;
        int r=0;
        for(int j=k;j<temp.length;j++){
            temp[j]=arr2[r];
            r++;
        }
        Arrays.sort(temp);
        if(temp.length%2==0){
            return (temp[temp.length/2]+temp[temp.length/2 - 1])/2;
        }
        else{
            return temp[temp.length/2];
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n1=sc.nextInt();
        System.out.println("enter the elements first array");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the size of second array");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        float median=findMedian(arr1,arr2);
        System.out.println("the median of two sorted array is " + median);
        sc.close();
    }
}
