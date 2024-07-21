package myName.recursion;

public class PrintNto1 {

   public static void printNto1(int n){
    if(n<1){
        return;
    }
    System.out.println(n);
        printNto1(n-1);
   }
    public static void main(String[] args) {
        printNto1(5);
    }
}
