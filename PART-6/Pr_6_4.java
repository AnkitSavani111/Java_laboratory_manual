/*
   Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the priority of
the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the ‘THIRD’ thread to 7
*/

// Ankit Savani (21CE122)

public class Pr_6_4 {
    public static void main(String[] args) {
        FIRST firstObj = new FIRST();
        firstObj.setName("FIRST");
        SECOND secondObj = new SECOND();
        secondObj.setName("SECOND");
        THIRD thirdObj = new THIRD();
        thirdObj.setName("THIRD");

        firstObj.setPriority(3); // Setting priority of FIRST thread to 3
        secondObj.setPriority(5); // Setting priority of SECOND thread to 5
        thirdObj.setPriority(7); // Setting priority of THIRD thread to 7

        firstObj.start();  // Threads runs randomly so we can't predict the order of execution
        secondObj.start();  
        thirdObj.start();
    }
}

class FIRST extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : "  // Printing the priority of thread
                + Thread.currentThread().getPriority());
    }
}

class SECOND extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : " // Printing the priority of thread
                + Thread.currentThread().getPriority());
    }
}

class THIRD extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : " // Printing the priority of thread
                + Thread.currentThread().getPriority());
    }
}