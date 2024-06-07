package myName.mathematics;
import java.util.Scanner;
public class trailingZeros {

    public static int getNoOFZeros(int n){
        int fact=1;
        int count=0;
        if(n==0 || n==1){
            return 1;
        }
        else{
            for(int i=2;i<=n;i++){
                fact=fact*i;
            }
        }
        while(fact%10==0){
            count++;
            fact=fact/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int noOfZeros=getNoOFZeros(n);
        System.out.println("the number of zeros in the " + n + " factorial is " + noOfZeros);
        sc.close();
    }
}
