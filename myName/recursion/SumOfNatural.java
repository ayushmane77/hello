package myName.recursion;
import java.util.Scanner;
public class SumOfNatural {
    public static int getSum(int n){
        if(n==1){
            return 1;
        }
        return n+getSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int res=getSum(n);
        System.out.println(res);
        sc.close();
    }
}

