package myName.javaRequiredBasics.MultiThreading;
import java.util.Scanner;


// what is multithreading?
// Multithreading in Java is a process of executing multiple threads simultaneously.
// A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.


class myThread extends Thread{ // extending the thread class
    @Override
    public void run(){ // overriding the run method
        for(int i=0;i<=5;i++){
            System.out.println("Thread : " + i ); // printing the thread name and the value of i
            try{ // try block to catch the exception
                Thread.sleep(1000); // making the thread sleep for 1000 milliseconds equal to 1 second
            }
            catch(Exception e){ // catching the exception
                System.out.println(e.fillInStackTrace()); // printing the exception
            }
        }
    }
}

class newThread extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread : Hello");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.fillInStackTrace());
            }
        }
    }
}


public class myclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        myThread obj=new myThread();
        newThread obj2=new newThread();
        obj.start();
        obj2.start();
        sc.close();
    }
}
