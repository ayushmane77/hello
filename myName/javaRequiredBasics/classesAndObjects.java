package myName.javaRequiredBasics;

import java.util.Scanner;

public class classesAndObjects {
     public static void main(String[] args) {
        //  1)class is a blueprint which defines some properties and behaviours. An
        // object is an instance of a class
        // which has those properties and behaviours
        // attached

        //2)  A class is not allocated memory when
        // it is defined . An object is allocated
        // memory when it is created.

        //3)  Class is a logical entity whereas
        // objects are physical entities.

        //4) A class is declared only once. On
        // the other hand , we can create multiple objects
        // of a class.

        //5) A class is a way to arrange data and behaviour information.It is a template that must be implemented by
        //  its objects.

        //6) A class can also be seen as a user defined data type where any object of defined data types has some
        // defined properties and behaviours.

        Dog d1=new Dog();  // Dog is the name of the class.
                           // d1 is the name of the reference variable
                           // new is the keyword for creating new object from the class.
                           // Dog() is the name of the constructor
        d1.Name="tommy";
        d1.bark();

        Dog d2=new Dog();
        d2.Name="lame";
        d2.walking();

        d2.color="Black";
        System.out.println(d2.color);

        Scanner sc=new Scanner(System.in);
        Greetings greet=new Greetings();
        System.out.println("please enter your name");
        String Name=sc.nextLine();
        greet.welcome(Name);
        sc.close();
    }
}
class Dog{
    String Name;     // all these variables are instance variable
    int age;
    String color;    // these are some properties of a class
    String breed;
    float weight;

    public  void bark(){  // cannot define the static for this method(function) because it would not be accessible to
                          // the main method
        System.out.println(Name + " is barking ");
    }
    public void walking(){
        System.out.println(Name + " is walking");
    }
    
}

class Greetings{
    String Name;
    public void welcome(String name){
        System.out.println("welcome " + name);

    }
}

