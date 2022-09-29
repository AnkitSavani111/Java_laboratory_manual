/*
    Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the priority of
the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the ‘THIRD’ thread to 7
    wait() method is a part of Thread Class.
*/

// Ankit Savani (21CE122)


public class Pr_6_5
{
    public static void main(String[] args) {
        CustomThread First = new CustomThread();
        CustomThread Second = new CustomThread();
        CustomThread Third = new CustomThread();
        
        First.setPriority(3); // Setting priority of FIRST thread to 3
        Second.setPriority(5); // Setting priority of SECOND thread to 5
        Third.setPriority(7); // Setting priority of THIRD thread to 7

        First.start();
        Second.start();
        Third.start();
    }
}


class CustomThread extends Thread
{
    public void run()
    {
        Ankit(); //calling the method
        System.out.println("priority of this thread is : "+Thread.currentThread().getPriority()); // Printing the priority of thread
        
    }
    public synchronized void Ankit()
    {
        try
        {
            wait(5000); // it will wait for 5 seconds. basically wait is used to pause the execution of thread
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt(); // it will interrupt the thread
            System.out.println("Thread interupted");
        }
    }
}