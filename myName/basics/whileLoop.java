package myName.basics;

public class whileLoop {
    public static void main(String[] args) {
        int i=1,sum=0,n=4;
        while (i<=n) {
            sum=sum+i;
            i++;
        };
        System.out.println(sum);
    }
}
