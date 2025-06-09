package myName.strings;
import java.util.Scanner;
public class givenStringIsSubsequenceOfOther {

    public static boolean isSubsequence(String str1, String str2){
        if(str1.length()>str2.length()){
            return false;
        }
        int i=0;
        int j=0;
        int count=0;
        while(j<str1.length() && i<str2.length()){
            if(str1.charAt(j)==str2.charAt(i)){
                i++;
                j++;
                count++;
            }
            else{
                i++;
            }
        }
        return (count==str1.length())?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string");
        String str1 = sc.nextLine();
        System.out.println("enter the second string");
        String str2 = sc.nextLine();
        boolean res=isSubsequence(str1,str2);
        System.out.println(res);
        sc.close();
    }
}
