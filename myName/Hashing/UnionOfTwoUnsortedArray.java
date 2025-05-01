package myName.Hashing;
import java.util.HashSet;
import java.util.Scanner;
// import java.util.Arrays;
public class UnionOfTwoUnsortedArray {

    // public static int findUnion(int arr1[],int arr2[]){
    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);
    //     int count=0;
    //     int previous=Integer.MIN_VALUE;
    //     int i=0,j=0;
    //     while(i<arr1.length && j<arr2.length){
    //         if(arr1[i]==arr2[j]){
    //             if(arr1[i]!=previous){
    //                 count++;
    //                 previous=arr1[i];
    //             }
    //             i++;
    //             j++;
    //         }
    //         else if(arr1[i]<arr2[j]){
    //             if(previous!=arr1[i]){
    //                 count++;
    //                 previous=arr1[i];
    //             }
    //             i++;
    //         }
    //         else{
    //             if(previous!=arr2[j]){
    //                 count++;
    //                 previous=arr2[j];
    //             }
    //             j++;
    //         }
    //     }
    //     while(i<arr1.length){
    //         if(arr1[i]!=previous){
    //             count++;
    //             previous=arr1[i];
    //         }
    //         i++;
    //     }
    //     while(j<arr2.length){
    //         if(arr2[j]!=previous){
    //             count++;
    //             previous=arr2[j];
    //         }
    //         j++;
    //     }
    //     return count;
    // }

    public static int findUnion(int arr1[],int arr2[]){
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++){  // or can also use for each loop
            h.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            h.add(arr2[j]);
        }
        return h.size();
        // time complexity : O(n+m)
        // aux complexity : O(n+m)
    }
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
        int ans=findUnion(arr1,arr2);
        System.out.println("the union is " + ans);
        sc.close();
    }
}
