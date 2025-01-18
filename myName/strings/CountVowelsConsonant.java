package myName.strings;
import java.util.Scanner;
public class CountVowelsConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int vowel=0;
        int consonant=0;
        System.out.println(str.length());
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'||str.charAt(i)=='E'|| str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' || str.charAt(i)=='a'||str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vowel++;
            }
            else{
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);

        String c=str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(c.length());
        sc.close();
    }
}
