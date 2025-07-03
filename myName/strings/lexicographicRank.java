package myName.strings;
import java.util.Scanner;
public class lexicographicRank {

    // Naive solution
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int rank(String str){
        int rank = 1;
        int n = str.length();
        int mul = factorial(n);
        for(int i= 0;i<str.length();i++){
            int count = 0;
            mul = mul/(n-i);
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)>str.charAt(j)){
                    count++;
                }
            }
            rank = rank + (count * mul); 
        }
        return rank;
    }
    // Time complexity : O(N^2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        int res = rank(str);
        System.out.println("lexicographic rank is " + res);
        sc.close();
    }
}
