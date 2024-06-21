package myName.bitmagic;
import java.util.Scanner;
public class countSetBits {

    // public static void setCount(int n){
    //     int res=0;
    //     while(n>0){
    //         if(n%2!=0){
    //             res++;

    //     }
    //     n=n>>1;  // or n=n/2;
    // }
    // System.out.println(res);
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the number ");
    //     int n=sc.nextInt();
    //     setCount(n);
    //     sc.close();
    // }

    // ----------------------------------------------


    // public static int setCount(int n){
    //     int res=0;
    //     while(n>0){
    //         res=res+(n&1);
    //         n=n/2;
    //     }
    //     return res;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter a number ");
    //     int n=sc.nextInt();
    //     int res=setCount(n);
    //     System.out.println(res);
    //     sc.close();
    // }

    public static int setCount(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int result=setCount(n);
        System.out.println(result);
        sc.close();
    }
}

