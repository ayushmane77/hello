package myName.javaRequiredBasics.polymorphism;

// Compile-time polymorphism, also known as method overloading, occurs when multiple methods in the same class have the same name but different parameters (either in number, type, or both). The method to be executed is determined at compile time based on the method signature.

// Here's an example demonstrating compile-time polymorphism:

class Calculator{
    void Addition(int a,int b){
        int sum=a+b;
        System.out.println("the int addition is " + sum);
    }

    void Addition(float a,float b){
        float sum2=a+b;
        System.out.println("the float addition is " + sum2);
    }

    void Addition(byte a,byte b){
        byte sum3=(byte) (a+b);
        System.out.println("the byte addition is " + sum3);
    }


}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.Addition(567, 563);
        obj.Addition(45.2f, 56.2f);
        obj.Addition(100, 23);
    }
}
