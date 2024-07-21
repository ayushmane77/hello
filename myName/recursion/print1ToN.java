package myName.recursion;

public class print1ToN {
    // one way
    // public static void printing1ToN(int n,int temp){
        
    //     if(temp>n){
    //         return;
    //     }
    //     System.out.println(temp);
        
    //     printing1ToN(n,++temp);
    // }    

    // another way
    public static void printing1ToN(int n){
        if(n==0){
            return;
        }
        printing1ToN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printing1ToN(5);
    }
}
