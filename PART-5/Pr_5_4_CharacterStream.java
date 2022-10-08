/*
    Write a program to show use of character and byte stream.
    This code is only for Character Stream
 */

// Ankit Savani (21CE122)

import java.io.*;

// Main class
public class Pr_5_2_1 {

    // Main driver method
    public static void main(String[] args)
            throws IOException {

        // Initially assigning null as we have not read anything
        FileReader sourceStream = null;

        // Try block to check for exceptions
        try {
            // Reading from file
            sourceStream = new FileReader("D:\\Programming\\Programs\\Java_Laboratory_Manual\\PART-5\\Pr_5_2.txt");

            // Reading sourcefile and writing content to target file character by character.

            int temp;

            // If there is content inside file than read
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);

            // Display message for successful execution of program
            System.out.print("Program successfully executed");
        }

        // finally block that executes for sure where we are closing file connections to avoid memory leakage
        finally {

            // Closing stream as no longer in use
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}

