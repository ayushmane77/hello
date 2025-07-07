package myName.strings;
import java.util.Scanner;
public class lexicographicRank {

    // Naive solution
    
    // public static int rank(String str){
    //     int rank = 1;
    //     int n = str.length();
    //     int mul = factorial(n);
    //     for(int i= 0;i<str.length();i++){
    //         int count = 0;
    //         mul = mul/(n-i);
    //         for(int j=i+1;j<str.length();j++){
    //             if(str.charAt(i)>str.charAt(j)){
    //                 count++;
    //             }
    //         }
    //         rank = rank + (count * mul); 
    //     }
    //     return rank;
    // }
    // Time complexity : O(N^2)


    // Optimized approach
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
        int count[] = new int[256];
        // Step 1: Count characters
        for(int i=0;i<n;i++){
            count[str.charAt(i)]++;
        }
        // Step 2: Check for duplicate characters
        for(int i=0;i<count.length;i++){
            if(count[i]>1){
                throw new IllegalArgumentException("String contains duplicate characters");
            }
        }
        // Step 3: Convert count[] to prefix sum array
        for(int i=1;i<count.length;i++){
            count[i] = count[i] + count[i-1];
        }
        // Step 4: Compute rank
        for(int i=0;i<n;i++){
            mul = mul/(n-i);
            rank = rank + (mul*count[str.charAt(i)-1]);
            // Update character count array
            for(int j=str.charAt(i);j<count.length;j++){
                count[j]--;
            }
        }
        return rank;
    }

    // Time complexity : O(N * CHAR) where CHAR is always fixed as 256
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        int res = rank(str);
        System.out.println("lexicographic rank is " + res);
        sc.close();
    }
}
