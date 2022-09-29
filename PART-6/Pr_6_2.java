/*
    Generate 15 random numbers from 1 to 100 and store it in an int array. Write a program to
    display the numbers stored at odd indexes by thread1 and display numbers stored at even indexes
    by thread2.
*/

// Ankit Savani (21CE122)

import java.util.*;

public class Pr_6_2 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = new Random().nextInt(100); // We are using random class to generate random numbers
        }

        System.out.println("The array is : ");
        for (int i = 0; i < 15; i++) {
            System.out.print(array[i] + " "); // Printing the array
        }

        System.out.println("\n\nStarting thread...");

        // thread1 for printing odd indexes of array
        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 1; i < 15; i = i + 2) {
                    System.out.println("Odd : " + array[i]); // Printing odd indexes
                }
            }
        };

        // thread2 for printing even indexes of array
        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 15; i = i + 2) {
                    System.out.println("Even : " + array[i]); // Printing even indexes
                }
            }
        };

        thread1.start(); // Starting thread1 synchronously 
        thread2.start(); // Starting thread2 synchronously
    }
}
