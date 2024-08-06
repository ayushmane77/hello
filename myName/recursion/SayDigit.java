package myName.recursion;
import java.util.Scanner;
public class SayDigit {
    public static void voidSayDigit(int n,String arr[]){
        if(n<=0){
            return;
        }
        int digit=n%10;
        n=n/10;
        voidSayDigit(n, arr);
        System.out.println(arr[digit]+"");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        voidSayDigit(n,arr);
        sc.close();
    }
}
