/*
    Write a program to to generate user defined exception using “throw” and “throws” keyword.
*/

// Ankit Savani (21CE122)

import java.util.*;
import java.util.function.Function;;

class ThrowException extends Exception {
    public ThrowException(String str) {
        super(str);
    }
}

class Pr_4_2 {
    public static void main(String[] args) {
        try {
            fun();
        } catch (ThrowException e) {
            System.out.println("Caught custom exception");
            System.out.println(e);
        }
    }

    static void fun() throws ThrowException {
        throw new ThrowException("Throw Custom exception");
    }
}