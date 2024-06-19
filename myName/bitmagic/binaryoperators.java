package myName.bitmagic;

public class binaryoperators {
    public static void main(String[] args) {
        // int x=3;
        // int y=6;
        // System.out.println(x&y);  //  bitwise AND(&) OPERATION 

        // int a=3;
        // int b=6;
        // System.out.println(a|b);  // bitwise OR(|) operation

        // int x=3;
        // int y=6;
        // System.out.println(x^y); // bitwise X-OR(^) operation

        // int x=3;
        // int y=6;
        // System.out.println(x<<y);  // bitwise left shift (<<) operation
        // // formula = x*2^y  

        // int x=9;
        // int y=2;
        // System.out.println(x>>y); // bitwise left shift (<<) operation
        // // formula = x/2^y

        int x=5;  
        System.out.println(~x); // bitwise NOT operator (~) 
        // binary representation of x=5 is   000....0101  (considered as positive number)
        // the bits gets inverted for x=5    111....1010  (considered as negative number)

        // if the MSB is 1, then it is considered as a negative number
        // if the MSB is 0, then it is considered as a positive number

        // now since we have to represent this binary representation in decimal(0-9) we have to invert  its bits again
        // so after inverting bits result is  000....0101

        // after this +1 is added to this binary representation

        // 000....0101
        //          +1
        // -----------
        // 000....0110    == 6

        // but since its 1s compliment representation was considered as negative so add minus(-) with the integer (i.e) = -6


    }
}
