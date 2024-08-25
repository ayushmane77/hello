package myName.javaRequiredBasics;

// Constructor chaining in Java refers to the process of calling one constructor from another constructor within the same class or from a subclass. This is typically done to avoid code duplication and to ensure that common initialization code is only written once.

// Types of Constructor Chaining:
// Within the Same Class (Using this()):

// A constructor can call another constructor in the same class using the this() keyword.
// This is useful for setting default values or performing a series of initializations.
// From a Subclass (Using super()):

// A constructor in a subclass can call a constructor in its superclass using the super() keyword.
// This ensures that the superclass's constructor is executed before the subclass's constructor.
class Person{
    int age;
    String name;
    public Person(){
        this("unknown",0);
    }
    public Person(String name){
        this(name,0);
    }
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Person per=new Person();
        Person per2=new Person("Saket");
        Person per3=new Person("Ayush",21);

        System.out.println(per.name + " " + per.age);
        System.out.println(per2.name + " " + per2.age);
        System.out.println(per3.age + " " + per3.name);
    }
}


