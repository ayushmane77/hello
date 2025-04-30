package myName.Hashing;
import java.util.Scanner;
import java.util.HashSet;
// import java.util.Arrays;
public class IntersectionOfTwoUnsortedArray {

    // naive solution
    // public static void findIntersection(int arr1[],int arr2[]){
    //     Arrays.sort(arr1); // sort the array : O(nlogn)
    //     Arrays.sort(arr2); // sort the array : O(mlogm)
    //     int i=0;
    //     int j=0;
    //     while(i<arr1.length && j<arr2.length){
    //         if(arr1[i]==arr2[j]){
    //             System.out.print(arr1[i] + " ");
    //             i++;
    //             j++;
    //         }
    //         else if(arr1[i]<arr2[j]){
    //             i++;
    //         }
    //         else{
    //             j++;
    //         }
    //     }
    //     // time complexity : (O(n+m)log(m+n))
    // }

    // public static void findIntersection(int arr1[],int arr2[]){
    //     // if(arr1.length>arr2.length){
    //     //     findIntersection(arr2, arr1);
    //     //     return;
    //     // }
    //     for(int i=0;i<arr1.length;i++){
    //         for(int j=0;j<arr2.length;j++){
    //             if(arr1[i]==arr2[j]){
    //                 System.out.print(arr1[i] + " ");
    //                 break;
    //             }
    //         }
    //     }
    //     // time complexity : O(n*m)
    // }

    public static void findIntersection(int arr1[],int arr2[]){
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++){
            h.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(h.contains(arr2[j])){
                System.out.print(arr2[j] + " ");
            }
        }
    }
    // time complexity : O(n+m)
    // aux space : O(n)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("enter the elements inside first array");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the size of second array");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("enter the elements inside second array");
        for(int j=0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
        findIntersection(arr1,arr2);
        sc.close();
    }
}
