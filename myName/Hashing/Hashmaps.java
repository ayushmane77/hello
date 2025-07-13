package myName.Hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;;
public class Hashmaps {
    public static void main(String[] args) {

        // hasmap stores data in the form of key value pair. It stores data in the dictionary
        // format where each key is unique.

        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> m = new HashMap<>(); // way of creating a hashmap in java
        m.put("Ayush", 98);
        m.put("Anish", 91);   // adding new elements inside hashmap using put method
        m.put("Tushar", 90);

        System.out.println(m); // {"Ayush"=98, "Anish"=91, "Tushar"=90}

        System.out.println("Ayush marks is " + m.get("Ayush")); // getting the value from the 
        // provided key.

        // m.remove("Tushar");    // both ways work 
        m.remove("Tushar",90);
        System.out.println(m);

        if(m.containsKey("Anish")){ // return true if the provided key is present in the hashmap
            System.out.println("marks of Anish is " + m.get("Anish"));
        }

        // traversing the hashmap using for each loop
        for(String names: m.keySet()){
            System.out.println(names + " scored " + m.get(names));
        }
        // or another way is by map interface
        for(Map.Entry<String,Integer> m2 : m.entrySet()){
            System.out.println(m2.getKey() + " " +  m2.getValue());
        }

        HashMap<Character, Character> h = new HashMap<>();
        h.put('a','o');
        h.put('b','h');
        System.out.println(h.get('a'));
        System.out.println(h.get('z')); // will return null value
        if(h.containsKey('o')){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        sc.close();
    }
}
