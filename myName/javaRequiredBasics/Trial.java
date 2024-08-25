package myName.javaRequiredBasics;

final class myPrivateClass{
    private int id=12;
    public String profession="Teacher";
    int age=31;
    
    void  println(){  // default access type
        System.out.println(id);
    }
    public void println2(){
        System.out.println(id);
    }
    private void println3(){ // cannot be called directly , use constructor
        System.out.println(id);
    }
    static void println4(){
        System.out.println("this is a method of myPrivateClass with static reference");
    }
    myPrivateClass(){  // default constructor explicitly defined
        println3();
        Trial trial=new Trial();
        trial.age=67;
        trial.height=7;
        trial.method2();
        // trial.method3(); it will not giv error but the method id defined from static reference
    }
}


public class Trial {
    public  int age; // public access modifier , accessible to all classes.
    private String name; // private access modifier, accessible to only its own class.
    int height=6; // default access modifier, accessible to only classes which belong to the 
    // same packages and not of differnt packages.


    public static int Number=7;

    // ****************************** very IMPORTANT **********************************************
// 
//     Static Variables:

// public static int Number = 7; is a static variable. This means it belongs to the class Trial itself rather than any instance of the class.
// Static variables can be accessed and modified using the class name (e.g., Trial.Number) or directly within static methods of the same class.
// Placement Matters:

// You can access and modify a static variable directly by its name or by using the class name in any static context, such as inside the main method or another static method.
// If you try to modify the static variable directly in the class body (outside of any method, block, or constructor), it will result in a compilation error because such assignments 
// are not allowed in the class body without being inside a static initializer block.

// ****************************** very IMPORTANT **********************************************

    private static void method(){
        System.out.println("this is a private method");
    }
    public  void method2(){
        System.out.println("this is a public method without static reference");
        age=12; // age is accessible inside this method because it is non static and the method is also non static.
    }
    static void method3(){
        System.out.println("this is a default method");
    }
    protected static void method4(){
        // age=34; a static member cannot access the non - static member age
        System.out.println("this is a protected method");
    }
    // age=56; // age is not accessible even in the same class 
    // Trial.Number=34; results in error
    // Number=67;results in error although being static

    public Trial() {
        // Modify static variable inside a method or constructor
        Number = 67;
    }

    static {
        // Modify static variable inside a static block
        Trial.Number = 34; // Correct way
        Number = 87; // Also correct in a static block
    }
    public static void main(String[] args) {
        Trial obj=new Trial();
        obj.age=18; // can be accessed from the same class or different class 
        // since the access modifier is public.
        System.out.println(Number);
        // or
        System.out.println(Trial.Number);
        obj.name="Ayush"; // can access the private access modifier only when 
        // defined in the same class.
        System.out.println(obj.name);

        obj.height=7;
        System.out.println(obj.height); // can be accessed within the same class and
        // and same package.

        method(); // calling a method defined within the same class statically.


        obj.method2();  // when a function is called like i.e(by creating a object of particular
        // class) it is known as calling a method without static reference.
        myPrivateClass obj1=new myPrivateClass();
        obj1.profession="Programmer";
        obj1.age=32;
        obj1.println();
        obj1.println2();
        // method3(); can be called like this 
        // method4(); // a function or method when called like this is static
        // method();
        // obj1.println3(); cannot call this println3() method which is private 
        ProtectedUse obj4=new ProtectedUse();
        obj4.parent="Ayush"; // can access the protected variable
        // present in the 'ProtectedUse' class because it still belongs 
        // to the same package and not of inherited class.
    }
}
