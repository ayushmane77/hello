package myName.mathematics;

import java.util.Scanner;

public class Exactly3Divisors {

    public static int exactly3Divisors(int n){
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=exactly3Divisors(n);
        System.out.println(res);
        sc.close();
    }
}
