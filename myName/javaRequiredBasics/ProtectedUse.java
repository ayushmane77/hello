package myName.javaRequiredBasics;

public class ProtectedUse {

    // protected is the access modifier to define the level of access
    // within the same class, same package, and subclass even from 
    // different packages.

//  Within the Same Class: The protected member can be
//  accessed from within the class where it is declared.

//  Within the Same Package: The protected member can be 
//  accessed by any class within the same package.

// In Subclasses (Even if in Different Packages): The protected
//  member can be accessed by subclasses, even if they are in different packages. However, in this case, access is typically via inheritance, meaning the subclass accesses the protected member through an instance of the subclass itself, not directly through an instance of the superclass.

    protected String parent="Prakash Mane";
    public int number=10;
    int number2=20;
    public static void main(String[] args) {
        return;
    }
}

class Children extends ProtectedUse{
    public static void main(String[] args) {
        Children obj=new Children();
        obj.parent="Manisha Mane";
        System.out.println(obj.parent);
    }   
}
