/*
    Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two
    exceptions. Each ‘catch’ block handles a different type of exception. For example the exception
    could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’. Display a message in
    the ‘finally’ block.
*/

// Ankit Savani (21CE122)

import java.util.*;

public class Pr_4_3 {
    public static void main(String[] args) {
        try {   
            throw new ArithmeticException(); // Can be ArrayIndexOutOfBoundsException too
        }
        catch(ArithmeticException e) { 
            System.out.println("ArithmeticException Caught");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Caught");
        }
        finally {
            System.out.println("Finally Block called");
        }
    }
}