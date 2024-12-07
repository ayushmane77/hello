package myName.bitmagic;
import java.util.Scanner;
public class countSetBitsOfPrime {

    public static int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int setBits=0;
            int temp=i;
            while(temp>0){
                if(temp%2!=0){
                    setBits++;
                }
                temp=temp>>1;
            }
            if(isPrime(setBits)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the left value");
        int left=sc.nextInt();
        System.out.println("enter the right value");
        int right=sc.nextInt();
        int count=countPrimeSetBits(left,right);
        System.out.println("the total number of prime set bits is " + count);
        sc.close();
    }
}
