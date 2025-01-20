package myName.strings;
import java.util.Scanner;
public class stringBuilders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        // for inserting any char or string in a current stringBuilder, we use .insert(index,char) or insert(index,String) method
        System.out.println(sb.insert(2,'f'));

        // for changing the char at the required current StringBuider index, we use .setCharAt(index,char);
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // for deleting the char or substring from the currect StringBuilder , we use .delete() method
        System.out.println(sb.delete(2, 3));
        sc.close();

        // for Inserting the element at the end of the current StringBuilder , we use .append() method
        StringBuilder h=new StringBuilder("H");
        h.append("e");                  // or   System.out.println(h.append("e"));
        h.append("l");                  // or   System.out.println(h.append("l"));
        h.append("l");                  // or   System.out.println(h.append("l"));
        h.append("o");                  // or   System.out.println(h.append("o"));
        System.out.println(h);

        // to reverse a StringBuilder, we use .reverse() method
        // Reverse a String: Write a program to reverse a string using StringBuilder.
        StringBuilder Sb=new StringBuilder("hello");
        System.out.println(Sb.reverse());

        // Check for Palindrome: Given a string, check if it's a palindrome using StringBuilder.
        // StringBuilder p=new StringBuilder("cadam");
        // if(p.reverse().equals(p)){ // NO mater whatever may be the content inside the StringBuilder content, it will always return Palindrome in this case, because StringBuilder objects are mutable,
            // so, if .reverse() method is invoked, it will affect changes in the same object.
            // System.out.println("palindrome");
        // }
        // else{
            // System.out.println("Not a palindrome");
        // }

        // StringBuilder sb1=new StringBuilder("madam");
        // StringBuilder sb2=new StringBuilder(sb1.reverse());
        // if(sb1.equals(sb2)){
        //     System.out.println(true);
        // }
        // else{
        //     System.out.println(false); // always return false, because StringBuilder class .equals() methods check refrences and not the actual content.
        // }

        // ----------------------IMPORTANT----------------------------------------------

        // The equals() method of the StringBuilder class is not overridden to compare the content of the StringBuilder objects. Instead, it inherits the default implementation from the Object class.
        //This default Object.equals() implementation checks object references, meaning it returns true only if both objects refer to the same memory location.
        // So, even though the StringBuilder objects might have the same content, p.equals(p.reverse()) will return false unless they are the exact same object (which they are not in this case).
        // StringBuilder is mutable, meaning its content can change. Operations like .reverse() modify the object directly.
        // String is immutable, meaning its content doesn’t change, and comparisons are based on value.

        // correct implementation for palindrome using StringBuilder class
        StringBuilder m=new StringBuilder("madam");
        String m2=m.reverse().toString();
        if(m2.equals(m.reverse().toString())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        // or
        StringBuilder sb2=new StringBuilder("madam");
        StringBuilder sb3=new StringBuilder(sb2.reverse());
        if(sb3.toString().equals(sb2.reverse().toString())){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }

        // Remove Vowels from a String: Write a program to remove all vowels from a given string using StringBuilder.
        StringBuilder input=new StringBuilder("beautiful");
        StringBuilder v=new StringBuilder("");
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!='a' && input.charAt(i)!='e' && input.charAt(i)!='i' && input.charAt(i)!='o' && input.charAt(i)!='u'){
                v.append(input.charAt(i));
            }
        }
        System.out.println(v);

        // Insert a Substring: Write a program to insert the string "world" into "hello" at index 5 using StringBuilder.
        StringBuilder sb4=new StringBuilder("hello");
        sb4.insert(5,"World");
        System.out.println(sb4);

        // Character Frequency Count: Count the frequency of each character in a string using StringBuilder.
        // Input: "apple"
        String s="apple";
        StringBuilder counted=new StringBuilder(""); // to keep track of the counted characters
        StringBuilder res=new StringBuilder(""); // to store the result
        for(int i=0;i<s.length();i++){ // loop through the string
            char ch=s.charAt(i);      // get the character at the current index
            if(counted.indexOf(String.valueOf(ch))==-1){ // if the character is not counted yet
                int count=0; // to store the count of the character
                for(int j=0;j<s.length();j++){ // loop through the string again
                    if(ch==s.charAt(j)){ // if the character at the current index is equal to the character at the jth index
                        count++; // increment the count
                    }
                }
                res.append(ch).append(": ").append(count).append("\n"); // append the character and its count to the result
                counted.append(ch); // append the character to the counted StringBuilder
            }
        }
        System.out.println(res);

        // note
        // The indexOf() method returns the index of the first occurrence of the specified character or substring in the StringBuilder object. If the character or substring is not found, it returns -1.
        // the String.valueOf() method converts the character to a string.

        // Merge Two Strings Alternately: Given two strings, merge them alternately using StringBuilder.
        // Input: "abc", "1234"
        // Output: "a1b2c34"

        String str1="abc";
        String str2="1234";
        int i=0,j=0;
        boolean flag=true;
        StringBuilder sb5=new StringBuilder("");
        while(i<str1.length() && j<str2.length()){
            if(flag){
                sb5.append(str1.charAt(i));
                i++;
                flag=false;
            }
            else{
                sb5.append(str2.charAt(j));
                j++;
                flag=true;
            }
        }
        while(i<str1.length()){
            sb5.append(str1.charAt(i));
            i++;
        }
        while(j<str2.length()){
            sb5.append(str2.charAt(j));
            j++;
        }
        System.out.println(sb5);

        //Remove Consecutive Duplicates: Write a program to remove consecutive duplicate characters using StringBuilder.
        //Input: "aabbccdde"
        // Output: "abcde"

        String in="aabcbdecf";
        StringBuilder process=new StringBuilder("");
        StringBuilder output=new StringBuilder("");
        for(int k=0;k<in.length();k++){
            char c=in.charAt(k);
            if(process.indexOf(String.valueOf(c))==-1){
                output.append(c);
                process.append(c);
            }
        }
        System.out.println(output);
    }
}
