package myName.sorting;

import java.util.Scanner;

public class NaivePartition {

    public static void partition(int arr[],int p,int low,int high){
        int temp[]=new int[high-low+1];
        int index=0;
        for(int i=low;i<=high;i++){
            if(arr[i]<=arr[p] && i!=p){
                temp[index]=arr[i];
                index++;
            }
        }
        temp[index++]=arr[p];
        for(int i=low;i<=high;i++){
            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<=high;i++){
            arr[i]=temp[i];
        }
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
        System.out.println("enter the pivot element index");
        int p=sc.nextInt();
        partition(arr,p,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
