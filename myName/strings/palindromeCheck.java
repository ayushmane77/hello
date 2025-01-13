package myName.strings;
import java.util.Scanner;
public class palindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        String Cleaned_str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(Cleaned_str);
        int low=0;
        int high=Cleaned_str.length()-1;
        boolean isPalindrome=true;
        while(low<high){
            if(Cleaned_str.charAt(low)!=Cleaned_str.charAt(high)){
                isPalindrome=false;
                break;
            }
            low++;
            high--;
        }
        System.out.println("the given string is " + isPalindrome);
        sc.close();
    }
}
