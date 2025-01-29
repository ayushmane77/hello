package myName.strings;
import java.util.Scanner;
public class FilterCharactersFromString {

    public static String removeReferenceString(String str,String ref){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if(isNotContainsCharOfReference(ref,str.charAt(i))){
                sb=sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static boolean isNotContainsCharOfReference(String ref,char c){
        for(int j=0;j<ref.length();j++){
            if(c==ref.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input string");
        String str=sc.nextLine();
        System.out.println("enter reference string");
        String ref=sc.next();
        String res=removeReferenceString(str,ref);
        System.out.println("the filtered string is " + res);
        sc.close();
    }
}
