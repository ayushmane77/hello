package myName.mathematics;

import java.util.Scanner;

public class alternatingSum {
    public static int Sum(int n) {
        int temp=n;
        int count=0;
        int sum=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        int temp2=n;
        while(temp2>0){
            if(count%2!=0){
                int lastDigit=temp2%10;
                sum=sum+lastDigit;
                temp2=temp2/10;
                count--;
            }
            else{
                int lastDigit=temp2%10;
                sum=sum-lastDigit;
                temp2=temp2/10;
                count--;
            }
        }
        return sum;    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=Sum(n);
        System.out.println(sum);
        sc.close();
    }
}
