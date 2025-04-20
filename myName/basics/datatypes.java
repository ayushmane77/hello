package myName.basics;
import java.util.Scanner;
public class datatypes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    // primitive data tpyes
    byte data=56; //[-128 to 127]
    System.out.println(data);
   // int number=345;
   // float number2=3.14f;
   // double number3=65.889d;
   // boolean isAdult=true;
    // non-primitive data-types


    // strings in java are immutable 
        // which means once the name of the variable is declared and initialized 
        // , the same variable(or object) cannot be changed to another reassigned value.
        String s="java";
        s.concat("programming");
        System.out.println(s); // o/p:- java

        String firstName=new String("Ayush");
        String middleName=firstName.concat(" Prakash");
        String fullName=middleName.concat(" Mane");
        System.out.println(fullName);// Ayush Prakash Mane

        // or
        String Name="Ayush";
        System.out.println(Name.concat(" Mane")); // o/p:- Ayush Mane    

    String word=new String("Ayush");
    System.out.println(word.length());
    System.out.println("enter the marks of maths");
    int maths=sc.nextInt();
    System.out.println("enter the marks oof physics");
    int physics=sc.nextInt();
    System.out.println("enter the marks oof chemistry");
    int chemistry=sc.nextInt();
    double percentage=((maths+physics+chemistry)*100)/300;
    System.out.println(percentage);
    sc.close();

    }
    
}
