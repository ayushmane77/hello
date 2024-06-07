package myName.mathematics;

import java.util.Scanner;

public class soultions {
    public static int digitsInFactorial(int N){
        // code here
        int count=0;
        long result=1;
        if(N==0 || N==1){
            return 1;
        }
        else{
            
            for(int i=2;i<=N;i++){
                result=result*i;
            }
            
        }
        while(result>0){
            result=result/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int count=digitsInFactorial(n);
        System.out.println("the no of digits is " + count);
        sc.close();
    }
}

