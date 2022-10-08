/*      WAP to show how to create a file with different mode and methods of File class to find path, 
    directory etc.
*/

// Ankit Savani (21CE122)

import java.io.File;
import java.io.IOException;

public class Pr_5_1 {
    public static void main(String[] args) {
        File f = new File("Pr_5_1.txt");
        boolean result;

        try {
            result = f.createNewFile(); // creates a new file
            if (result) // test if successfully created a new file
            {
                System.out.println("file created " + f.getCanonicalPath()); // returns the path string
            } else {
                System.out.println("File already exist at location: " + f.getCanonicalPath()); 
            }
        } catch (IOException e) {
            e.printStackTrace(); // prints exception if any occurs
        }

        System.out.println("File name :" + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path:" + f.getAbsolutePath());
    }
}