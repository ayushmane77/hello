package myName.mathematics;
import java.util.Scanner;
public class digitsinFactorial {

    public static int digitsFactorial(int N){
        if(N==0||N==1){
            return 1;
        }
        else{
            int i=2;
            double logSum=0;
            while(i<=N){
                logSum=logSum+Math.log10(i);
                i=i+1;
            }
            int no_of_digits=(int)Math.floor(logSum)+1;
            
            return no_of_digits;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int N=sc.nextInt();
        int number=digitsFactorial(N);
        System.out.println("total number of digits in the factorial of the number are " + number);
        sc.close();
    }
}
