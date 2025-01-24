package myName.strings;
import java.util.Scanner;

public class ImpStringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=" Hello World  ";
        System.out.println(str.trim());
        System.out.println(str.substring(2,11));
        // the .subString() method contains two values ranges, 1st which is inclusive, and 2nd which is exclusive(not in range).
        // System.out.println(str.toLowerCase());
        // System.out.println(str.toUpperCase());
        // System.out.println(str.charAt(2));

        String str2="Hello There , Hello";
        System.out.println(str2.replace("H","F"));
        // Replaces all occurrences of a literal character or substring with another character or substring.
        // Does not use regular expressions.

        // Characteristics
        // 1. It replaces exact matches of characters or substrings.
        // 2. Works with both char and CharSequence (like String).
        // 3. Does not interpret special characters or patterns (e.g., regex metacharacters).
        // Use replace() when: You are replacing a fixed, literal character or substring.

        String str3="Hello 123 world";
        System.out.println(str3.replaceAll(".","*"));
        System.out.println(str3.replaceAll("\\d","*"));

        // Write a Java program to replace all digits in a string with the character *.
        String contact="Contact me at 4533266031";
        System.out.println(contact.replaceAll("[0-9]", "*"));

        // Write a Java program to remove all special characters (non-alphanumeric) from a string
        String email="Hello@World!#2025#java";
        System.out.println(email.replaceAll("[^a-zA-Z0-9]", ""));

        // Write a Java program to replace all multiple spaces in a string with a single space.
        String space="Hello  nice to  meet you  ";
        System.out.println(space.replaceAll("\\s+"," "));

        // Replaces all substrings that match a regular expression with a specified replacement string.
        // Utilizes regular expressions for pattern matching.

        // Characteristics

        // 1. Matches substrings using regular expressions.
        // 2. Can handle complex patterns and special characters.
        // 3. Suitable for more advanced and flexible replacements.
        // Use replaceAll() when: You need to replace based on patterns (e.g., digits, whitespace, letters).

    // ------------------------------------------------------------------------------------

    // split method in java
    //  Write a Java program to split a paragraph into individual sentences. Use the period (.) as the delimiter.
        String para="Java is fun. It is powerful . Let's code!";
        String[] sentence=para.split("\\.");
        // for(int i =0;i<sentence.length;i++){
        //     System.out.println(sentence[i] + " ");
        // }
        // or
        for(String st:sentence){
            System.out.println(st);
        }

        // Write a Java program to extract all the words from a given sentence by splitting on spaces. Ignore extra spaces between words.
        String str4="  Hello world this is java ";
        String[] message = str4.split("\\s+");
        for(String m: message){
            System.out.println(m);
        }

        // Write a Java program to split a single line of comma-separated values (CSV) into individual fields.
        String str5="Ayush,Mane,22,Software Engineer";
        String[] info=str5.split("\\,");
        for(String i:info){
            System.out.println(i);
        }

        // ----------------------------------------------------------------------

        // toCharArray() method 
        String name="Ayush";
        char[] arr=name.toCharArray();
        for(char c:arr){
            System.out.println(c);
        }

        String caps="WWW.example.com";
        caps=caps.replaceAll("[.]", "-");
        System.out.println(caps);
        sc.close();
    }
}
