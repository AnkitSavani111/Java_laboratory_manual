/*
   Write a program to create thread which display “Hello World” message.
         A. by extending Thread class
         B. by using Runnable interface.
*/

// Ankit Savani (21CE122)

// A. by extending Thread class
class Thread1 extends Thread {
    public void run() {
        System.out.println("Hello world with extending Thread class."); // Thread1 extends Thread class
    }
}

// B. by using Runnable interface.
class Thread2 implements Runnable {
    public void run() {
        System.out.println("Hello world with Runnable interface"); // Thread2 implements Runnable interface
    }
}

public class Pr_6_1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread t = new Thread(new Thread2());
        t.start();
    }
}