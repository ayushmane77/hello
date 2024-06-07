package myName;

public class doWhile {
    public static void main(String[] args) {
        int i=1,sum=0,n=4;
        do{
            System.out.println("I will always be executed"+i);
            sum=sum+i;
            i++;
        }while(i>n);
        System.out.println("the sum is"+sum);
            
    }
}
