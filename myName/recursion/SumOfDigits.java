package myName.recursion;
import java.util.Scanner;
public class SumOfDigits {

    public static int sumOfDigit(int n){
        if(n<=0){
            return 0;
        }
        return n%10+sumOfDigit(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int res=sumOfDigit(n);
        System.out.println(res);
        sc.close();
    }
}
