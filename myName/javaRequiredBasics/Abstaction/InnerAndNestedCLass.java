package myName.javaRequiredBasics.Abstaction;

// A non-static nested class is a class within another class. It has access to members of the 
// enclosing class (outer class.) It is commonly known as inner class.

// since the inner class exists within the outer class, you must instantiate the outer class first,
// in order to instantiate the inner class.



public class InnerAndNestedCLass {
    class innerClass{
        public int x=12;
    }

// unlike inner class, a static nested class cannot access the member variables of the outer class.
// It is because the static nested class doesn't require you to create an instance of the outer class.

// Using the nested class makes your code more readable and provide better encapsulation.
    static class staticClass{
        public int y=16;
    }

    public static void main(String[] args) {
        // innerClass obj=new innerClass(); cannot do like this, since the class "staticClass
        // is inside the main class "InnerAndNestedClass".

        InnerAndNestedCLass obj=new InnerAndNestedCLass();
        innerClass obj1=obj.new innerClass();
        System.out.println(obj1.x);

        staticClass obj2=new InnerAndNestedCLass.staticClass();
        System.out.println(obj2.y);
    }
}