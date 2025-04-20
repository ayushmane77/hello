
import java.util.*;
public class arrays {
    public static void main(String[] args) {

        // linear search

    //    Scanner sc=new Scanner(System.in);
    //    System.out.println("enter the number you want to search");
    //    int n=sc.nextInt();
    //    int number[]={11,34,2,12,65,23};
    //    for(int i=0;i<number.length;i++){
    //     if(number[i]==n){
    //         System.out.println("the element is found at index " + i);
    //         break;
    //     }
    //     else{
    //         continue;
    //     }
    //    }

    //    sc.close();

   // Take an array of names as input from the user and print them on the screen.


    // System.out.println("enter the size of array");
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // String names[]=new String[n];
    // for(int i=0;i<names.length;i++){
    //     names[i]=sc.next();
    // }
    // for(int j=0;j<names.length;j++){
    //     System.out.println("elements are " + names[j]);
    // }
    // sc.close();

    //Find the maximum & minimum number in an array of integers. 


    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter the size of array");
    // int n=sc.nextInt();
    //     int numbers[]=new int[n];
    //     for(int i=0;i<numbers.length;i++){
    //         numbers[i]=sc.nextInt();
    //     }
    //     for(int i=0;i<numbers.length-1;i++){
    //         if(numbers[i]>numbers[i+1]){
    //             int temp=numbers[i];
    //             numbers[i]=numbers[i+1];
    //             numbers[i+1]=temp;
    //         }
    //         else{
    //             continue;
    //         }
            
    //     }
        
    //     System.out.println("Sorted array:");
    //     for(int j=0;j<numbers.length;j++){
    //         System.out.println("the elements are " + numbers[j]);
    //     }
    //     System.out.println("the maximum element is " + numbers[n-1]);
    //     System.out.println("the minimum element is " + numbers[0]);
    //     sc.close();

    // alternate way 
    
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // int numbers[]=new int[n];
    // //input 
    // for(int i=0;i<numbers.length;i++){
    //     numbers[i]=sc.nextInt();
    // }
    // int max=Integer.MIN_VALUE;
    // int min=Integer.MAX_VALUE;
    // for(int i=0;i<numbers.length;i++){
    //     if(numbers[i]<min){
    //         min=numbers[i];
    //     }
    //     if(numbers[i]>max){
    //         max=numbers[i];
    //     }
    // }
    // System.out.println("the minimum number is " + min);
    // System.out.println("the maximum number is " + max);
    // sc.close();


    //reversing an array

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements inside an array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("this is your array");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    for(int i=0;i<arr.length/2;i++){
        int temp;
        temp=arr[n-1-i];
        arr[n-1-i]=arr[i];
        arr[i]=temp;

    }
    System.out.println("reversed array is ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    sc.close();
    }
}
