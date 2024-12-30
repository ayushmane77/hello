package myName.mathematics;
import java.util.Scanner;
public class ArmstrongNumber {

    public static boolean isArmStrongNumber(int n){
        int temp=n;
        int power=0;
        while(temp>0){
            power++;
            temp=temp/10;
        }
        double sum=0;
        int temp2=n;
        while(temp2>0){
            int lastDigit=temp2%10;
            sum=sum+Math.pow(lastDigit,power);
            temp2=temp2/10;
        }
        double n1=n;

        return (n1==sum)?true:false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        boolean res=isArmStrongNumber(n);
        System.out.println(res);
        sc.close();
    }
}
