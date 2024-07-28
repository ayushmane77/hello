package myName.recursion;
import java.util.Scanner;
public class IsPalindrome {

    public static boolean isPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        return ((str.charAt(start))==(str.charAt(end))) && isPalindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int start=0;
        int end=str.length()-1;
        boolean res=isPalindrome(str,start,end);
        System.out.println(res);
        sc.close();
    }
}
