package myName.mathematics;
import java.util.Scanner;
public class palindrome {

    public static boolean checkResult(int n){
        int temp=n;
        int reverse=0;
        while(temp>0){
            int lastdigit=temp%10;
            reverse=reverse*10+lastdigit;
            temp=temp/10;
        }
        if(reverse==n){
            return true;
        }
        else{
            return  false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc.nextInt();
        boolean result=checkResult(n);
        System.out.println("the given number is " + result);
        sc.close();
    }
}
