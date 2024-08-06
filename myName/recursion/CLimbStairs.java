package myName.recursion;
import java.util.Scanner;
public class CLimbStairs {

    public static int possibleWays(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return possibleWays(n-1) + possibleWays(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the stairs");
        int n=sc.nextInt();
        int res=possibleWays(n);
        System.out.println(res);
        sc.close();
    }
}
