package myName;
import java.util.Scanner;
public class StringOperations {
    
    public static void main(String[] args) {
        // String firstName="Ayush";
        // String lastName="Mane";
        // String fullname=firstName+" " + lastName;
        // System.out.println("your fullname is " + fullname );

        // taking input from the user as string

        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter your first name");
        // String firstName=sc.nextLine();
        // System.out.println("enter your lastname ");
        // String lastName=sc.nextLine();
        // System.out.println("your fullname is " + firstName + " " + lastName);
        
        // sc.close();


        // string methods

        // String abc=new String("Hello Ayush");
        String abc="Hello Ayush";
        System.out.println("the total characters in the string are " + abc.length());
        System.out.println(abc.charAt(10));
        System.out.println(abc.substring(3,9));
        System.out.println(abc.toLowerCase());
        System.out.println(abc.toUpperCase());
        System.out.println(abc.indexOf("A"));
        System.out.println(abc.replace("H", "C"));
        System.out.println(abc.concat("  Nice to meet you"));
        System.out.println(abc.compareTo("Hello Ayush"));

        // Strings are the sequence of characters which contain an index

        Scanner sc=new Scanner(System.in);
        String fullName=new String("Tony stark");
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i));
        }

        System.out.println();
        boolean response=fullName.equals("Tony stark")?true:false;
        System.out.println(response);
        sc.close();

    }
}
