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
    public int age; // public access modifier , accessible to all classes.
    private String name; // private access modifier, accessible to only its own class.
    int height=6; // default access modifier, accessible to only classes which belong to the 
    // same packages and not of differnt packages.

    private static void method(){
        System.out.println("this is a private method");
    }
    public  void method2(){
        System.out.println("this is a public method without static reference");
    }
    static void method3(){
        System.out.println("this is a default method");
    }
    protected static void method4(){
        System.out.println("this is a protected method");
    }
    public static void main(String[] args) {
        Trial obj=new Trial();
        obj.age=18; // can be accessed from the same class or different class 
        // since the access modifier is public.

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
