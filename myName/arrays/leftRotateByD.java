package myName.arrays;
import java.util.Scanner;
public class leftRotateByD {
    // naive solution

    // public static void leftRotateByOne(int arr[]){
    //     int temp=arr[0];
    //     for(int j=1;j<arr.length;j++){
    //         arr[j-1]=arr[j];
    //     }
    //     arr[arr.length-1]=temp;
        
    // }

    // public static int[] LeftRotateByD(int arr[],int d){
    //     for(int i=0;i<d;i++){
    //         leftRotateByOne(arr);
    //     }
    //     return arr;
    // }

    // better approach
    
    // public static int[] LeftRotateByD(int arr[],int d){
    //     int temp[]=new int[d];
    //     for(int i=0;i<d;i++){ 
    //         temp[i]=arr[i];  //temp[]={56,43}
    //     }
    //     for(int i=d;i<arr.length;i++){ //[56,43,76,23,12]
    //         arr[i-d]=arr[i];  //[76,23,12,23,12]
    //     }
    //     for(int i=0;i<d;i++){
    //         arr[arr.length-d+i]=temp[i]; // arr[]={76,23,12,56,43}
    //     }
    //     return arr;
    // }

    // ALTERNATE APPROACH
    public static int[] LeftRotateByD(int arr[],int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        return arr;
    }

    public static int[] reverse(int arr[],int low,int high){
        int temp;
        while(low<high){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return arr;
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
        System.out.println("how many times to left rotate anti clockwise ?");
        int d=sc.nextInt();
        int res[]=LeftRotateByD(arr,d);
        System.out.println("this is the rusultant array");
        for(int j=0;j<res.length;j++){
            System.out.print(res[j] + " ");
        }
        sc.close();
    }
}
