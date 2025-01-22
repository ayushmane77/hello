package myName.javaRequiredBasics;
import java.util.Scanner;
public class generics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // experiment<String,Integer> exp=new experiment<String,Integer>("Ayush",77);
        // experiment<String,Integer> in=new experiment<String,Integer>("tushar",45);
        experiment<String,Integer> exp=new experiment<String,Integer>(); // we can also create a constructor in the experiment class to initialize the values of the object.
        exp.setData("Ayush", 18); // we can also create a method in the experiment class to set the values of the object.
        System.out.println(exp.getDataId());
        System.out.println(exp.getDataGR());
        experiment<Integer,String> exp2=new experiment<Integer,String>(); // we can also create a constructor in the experiment class to initialize the values of the object.
        exp2.setData(19, "S2151203");
        System.out.println(exp2.getDataId());
        System.out.println(exp2.getDataGR());

        // calling the generic method 
        generics.printData("Hello");
        printData(124);
        Integer arr[]={23,13,412}; // Integer array
        String str[]={"Ayush","tushar"}; // String array
        PrintArray(arr); // calling the method 'PrintArray' for printing Integer array elements.
        PrintArray(str); // calling the same method name 'PrintArray' for printing String array elements.
        sc.close();
    }
    public static <A> void printData(A data){ // A is the generic type
        System.out.println(data);
    }
    public static <P> void PrintArray(P[] data){ // P is the generic type, and P[] is the array of the generic type.
        for(P elem:data){ // elem is the generic type
            System.out.println(elem); // printing the elements of the array.
        }
    }






}
class experiment<t,g>{ // t and g are the generic types
    t id; // we can also create a constructor in the experiment class to initialize the values of the object.
    g gr_no;
    // public experiment(t id, g gr_no){
    //     this.id=id;
    // }
    public void setData(t id,g gr_no){ // we can also create a method in the experiment class to set the values of the object.
        this.id=id; // this.id is the instance variable and id is the local variable
        this.gr_no=gr_no; 
    }
    public t getDataId(){ // t is the return type of the method
        return id;
    }
    public g getDataGR(){ // g is the return type of the method. 
        return gr_no;
    }
}
