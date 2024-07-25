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

    private int accountNumber;  // private members
    private int id;             // private members

    public void setAccountNumber(int accNum){  // getters methods
        this.accountNumber=accNum;
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
}
