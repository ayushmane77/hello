package myName.javaRequiredBasics.encapsulation;

//1} only a single copy of the static variable is created
// and shared among all the instances of the class.
// 2} because it is a class-level variable ,memory allocation of
// each variables only happens once when the class is loaded
// in the memory.
//3} if an object modifies the value of a static variable, the change is 
// reflected accross all objects.
//4} Static variables can be used in any type of method: Static or no-Static.
//5} Non-static variables cannot be used inside static methods. It will 
// throw a compile time error.

//6} the static members and methods belong to the class rather than the
// instance of the class. When the implementation of the particulat method is no
// not dependent on the instance variables and instance methods, In this case
// we can make that method to be static.

//7} They are accessed by the name of the class.

//8} The keywords such as this and super are not used in the body of the 
// static method.

// 9} The modification of the static value is not allowed.

class Testing{
    private static double pie=3.14;
    static int numb=45;
    protected int count=7;
    Testing(){
        System.out.println(pie);
    }
}
public class StaticUse {
    public static int num=3;  // static variable 
    static int num2=5;
    private String constant="CONSTANT";
    private static String accessible="idAccessible";
    public String random="abc"; // non static variable
    private static void printNumbers(){ // static methods can be accessed directly
        // without creating an object.
        System.out.println(num);
    }
    static void printNumbers2(){
        System.out.println(num2);
    }
    public static void printNumbers3(){
        System.out.println(num);
    }
    public void printHello(){ // when the method is non-static , then its need to 
        // be invoked by creating an object of the class.
        System.out.println("hello");
    }

    protected void getmaxValue(int a,int b){
        System.out.println(Math.max(a, b));  // Math is the class and the max method is 
        // static. This the the reason we directly invoking the method 'max' from its class
        // name "Math" , without creating an object.

        // public static int max(int a, int b){// this is the method which is already written in Math class.
        //     return (a >= b) ? a : b;
        // }
    }

    static{
        System.out.println("this is the static block which will be executed before main method");
    }
    public static void main(String[] args) {
        StaticUse obj=new StaticUse();
        printNumbers();  // can access these methods because they are static and belong 
        // to same class.
        printNumbers2();
        StaticUse.printNumbers(); // or can call like this also.

        // printHello();// cannot access static reference to the non static 
        // reference

        System.out.println(StaticUse.accessible); // the private member(field) is
        // accessible like this because it is static and belongs to same class

        
        // StaticUse.constant="NOT"; //ERROR, cannot access a private non static member
        // need to create an object.
        System.out.println(obj.constant); // can access private non static fields inside same class.
        
        num=56;
        System.out.println(num); // static variable can be accessed and modified
        //  without creating an object

        // System.out.println(random); results in error , cannot make a static reference
        // to a non static field.

        StaticUse.num=7; // can be accessed by its class name and also the literal can 
        // be modified
        System.out.println(StaticUse.num);

        obj.printHello();// the non static method can be accessed now once 
        // an object is created.
        obj.getmaxValue(3,7); // calling non static method.
       Testing obj1=new Testing();
       Testing.numb=67; // can access the static member without object creation
       System.out.println(Testing.numb);

       System.out.println(obj1.count); // count is a non static member.
    
    //    obj1.double=56.7; cannot access the private members of another class
    //  although they are static.
       
    }
    static{
        System.out.println("this is second static methods"); // in short, all static methods will
        // be executed before main methods
    }
}
