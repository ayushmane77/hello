package myName.searching;
import java.util.Scanner;
public class squareRoot {

    // Naive solution

    // public static long findSquareRoot(long n){
    //     long i=1;
    //     while(i*i<=n){
    //         if(i*i==n){
    //             return i;
    //         }
    //         else if(i*i<n){
    //             i++;   
    //         }
            
    //     }
    //     return i-1;
    // }

    // Time complexity : O(sqrt(n))  // under root of n

    // -------------------------------------------------------------------------------------


    // optimized solution

    public static long findSquareRoot(long n){
        long ans=-1;
        long low=1;
        long high=n;
        while(low<=high){
            long mid=(low+high)/2;
            long sqrt=mid*mid;
            if(sqrt==n){
                return mid;
            }
            else if(sqrt<n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    // Time complexity: O(logn)
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to find square root of");
        long n=sc.nextLong();
        long res=findSquareRoot(n);
        System.out.println("the square root or (floor root) of " + n + " is " + res);
        sc.close();
    }
}
