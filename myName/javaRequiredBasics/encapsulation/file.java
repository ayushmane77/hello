package myName.javaRequiredBasics.encapsulation;

public class file {
    // Encapsulation refers to the bundling of fields and methods
    // inside a single class. It prevents outer clas from accessing 
    // and changing field and methods of a class. This also
    // hepls to achieve data hiding.

    // Data hiding is a way of restricating the access of our data
    // members by hiding impementations details. Encapsulation also 
    // provides a way for data hiding.
    // We can use access modifier to achieve data hiding.

    // People often consider encapsulation as data hiding , but that
    // is not entirely true. Encapsulation refers to the bundling of related
    // fields and methods together. This can be used to achieve data 
    // hiding. Encapsulationd in itself is not data hiding.

    private  int accountNumber;  // private members
    private int id;             // private members

    public void setAccountNumber(int accNum){  // getters methods
        this.accountNumber=accNum;
        // accountNumber=accNum; can also be accessed like this only when variable "accountNumber" is static
    }
    public void setId(int id){          // getter methods
        this.id=id;
    }
    public int getAccountNumber(){       // setter methods
        return accountNumber;
    }
    public int getId(){                // setter methods
        return id;
    }

    public static void main(String[] args) {
        StaticUse.num=89;
        System.out.println(StaticUse.num);
        
        System.out.println(StaticUse.num2);
        // StaticUse.random="xyz"; cannot access a non static variable outside of 
        // class by invoking by its class name 
        StaticUse.printNumbers2();
        StaticUse.printNumbers3();
        // StaticUse.printHello(); ERROR// cannot access a non static method without
        // creating an object.
        StaticUse obj=new StaticUse();
        obj.printHello(); // need to create an object to invoke a non static method

    }
}
