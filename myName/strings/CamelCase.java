package myName.strings;
import java.util.Scanner;
public class CamelCase {

    public static String convertToCamelCase(String str){
        StringBuilder sb=new StringBuilder("");
        boolean nextUppeCase=false;
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            if(currentChar==' ' || currentChar=='_' || currentChar=='-' || currentChar=='$'){
                nextUppeCase=true;
                continue;
            }
            if(nextUppeCase){
                sb.append(Character.toUpperCase(currentChar));
                nextUppeCase=false;
            }
            else{
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        String res=convertToCamelCase(str);
        System.out.println(res);
        sc.close();
    }
}
