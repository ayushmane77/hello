package myName.javaRequiredBasics;

public class MethodOverloading {
    // 1) two or more methods can have the same
    // name inside the same class
    // if they accept different arguments.
    // this feature is known as method overloading.

    // 2) method overloading is achieved by either :
    // changing the number of arguments
    // or by changing the data type of arguments.

    // 3) it is not method overloading if we only change the return type 
    // of methods.
    // there must be difference in the number of parameters.

    public static void main(String[] args) {
        Greet object=new Greet();
        // object.greet();
        // object.greet("Tushar");
        object.greet("Ayush",5);
    }
}

    class Greet{
    public void greet(){
        System.out.println("hello good morning");
    }

    public void greet(String name){
        System.out.println("hello " + name + ", good morning");
    }

    public void greet(String name,int count){
        for(int i=0;i<count;i++){
            System.out.println("hello " + name + ", good morning");
        }
    }
}
