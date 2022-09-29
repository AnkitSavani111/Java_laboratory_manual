/*
   Write a program to increment the value of one variable by one and display it after one
second using thread using sleep() method.
*/

// Ankit Savani (21CE122)

public class Pr_6_3 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); // Thread will sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e); // Printing the exception
            }
            System.out.println(i); // Printing the value of i after every 1 second
        }
    }
}
