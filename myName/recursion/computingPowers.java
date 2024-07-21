package myName.recursion;

public class computingPowers {
    
    public static int recursivePowers(int n, int p){
        
        if(p==0){
            return 1;
        }
        return n*recursivePowers(n, p-1);
    }
    public static void main(String[] args) {
        int result=recursivePowers(2,3);
        System.out.println(result);
    }
}
