package myName.javaRequiredBasics; // this is the package which defines the 
// folder and files(directory) of the class located

// import java.util.Arrays; // calling or importing the utility package 
// of Arrays defined in utility package.

import java.util.Scanner; // importing Scanner class from utility package

// import java.util.*; calling or importing all utility packages
public class LearnPackage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=16;
        System.out.println(age);
        Trial obj=new Trial();
        obj.age=16; // can access the age variable since it is public

        // obj.name="OM"; cannot access the name variable since it is private
        // cannot access the name variable because of its private restrictions.

        obj.height=6; // can be accessed since its access modifier type is default
        // and also it belongs from the same package from where it is invoked

        obj.method2();

        myPrivateClass obj3=new myPrivateClass();
        obj3.age=45;
        obj3.profession="Coder";
        obj3.println();
        obj3.println2();
        // obj3.println3(); cannot access println3() method because it is private 
        // not visible
        
        sc.close();
    }
}
