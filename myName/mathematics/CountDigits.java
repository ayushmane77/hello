package myName.mathematics;
import java.util.Scanner;;
public class CountDigits {

    public static int getDigitCount(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int result=getDigitCount(n);
        System.out.println("the count of the given digit is " + result);
        sc.close();
    }
}
