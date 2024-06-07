package myName;
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
