package myName.javaRequiredBasics;

public class Child extends Parents{

    public Child(String name){
        // explicitly calling of superclass constructor
        super(name); //super keyword used to invoke the immediate constructors of parent class.
    }
    public Child(){
        System.out.println("this is child class constructor");
    }
    void start(){
        // explicit calling of superclass method
        super.start();// super keyword used to invoke the invoke the method of parent class.
        System.out.println("car is running");
        // super.pie=34; super cannot access private members from parentclass.
        // vehicle="bmw"; whereas others members  are directly accessible without super keyword
        // super.vehicle="bmw"; // with super keyword
    }
    public static void main(String[] args) {
        Child obj=new Child("audi");
       // Child obj1=new Child();
       obj.start();
    }
    
}
