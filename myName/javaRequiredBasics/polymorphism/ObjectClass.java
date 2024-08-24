package myName.javaRequiredBasics.polymorphism;

// The Object class is the root of the class hierarchy in Java. Every class in Java directly or indirectly inherits from the Object class. This means that all classes in Java are descendants of the Object class, either directly or through a chain of other classes.

// Key Methods in the Object Class
// The Object class provides several important methods that every Java object inherits. Here are some of the most commonly used methods:

// public String toString()

// Returns a string representation of the object.
// By default, it returns a string that includes the class name followed by the "@" character and the object's hashcode in hexadecimal.
// public boolean equals(Object obj)

// Compares this object to the specified object.
// The default implementation checks if the references to the objects are the same.
// public int hashCode()

// Returns a hash code value for the object.
// The default implementation provides a hash code based on the memory address of the object.
// protected Object clone()

// Creates and returns a copy of the object.
// This method needs to be overridden and implemented correctly for a class to be cloneable.
// protected void finalize()

// Called by the garbage collector when there are no more references to the object.
// It is used to perform cleanup before the object is reclaimed by the garbage collector.
// public final Class<?> getClass()

// Returns the runtime class of the object.
// public void notify()

// Wakes up a single thread that is waiting on this object's monitor.
// public void notifyAll()

// Wakes up all threads that are waiting on this object's monitor.
// public void wait()

// Causes the current thread to wait until another thread invokes the notify() or notifyAll() method for this object.

class Car{
    String name;
    int manufacturingYear;

    public Car(String name,int manufacturingYear){
        this.name=name;
        this.manufacturingYear=manufacturingYear;
    }
    @Override
    public String toString(){ //  toString hava return type as String and public level access.
        return "the car name is " + name + " and manufacturing year is " + manufacturingYear;
    }
    
}

public class ObjectClass {
    public static void main(String[] args) {
        Car obj=new Car("Audi", 2024);
        System.out.println(obj.toString()); // tostring is a default method of a object class which is not extended(or inherited)
    }
}
