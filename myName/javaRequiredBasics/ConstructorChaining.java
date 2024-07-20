package myName.javaRequiredBasics;

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


