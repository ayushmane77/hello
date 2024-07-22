package myName;

import myName.javaRequiredBasics.Trial;

public class Trial2 {
    public static void main(String[] args) {
        Trial obj=new Trial();
        obj.age=34;
        System.out.println(obj.age);
        // obj.height=5; cannot access the height variable because
        // it is defined as default and we are accessing the variable 
        // in different package.

        // myPrivateClass obj4=new myPrivateClass();
        // cannot access the final class "myPrivateClass" defined 
        // in differnt package. 
        obj.method2();
        // obj.method3(); not accessible because it is default 

    }
}
