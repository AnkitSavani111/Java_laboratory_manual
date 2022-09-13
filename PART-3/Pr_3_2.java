/*  Write a program to create a default method in an interface IPrinter. Create an interface IPrinter
    and IScanner. You can assume variables and methodsfor both interfaces. Create a concrete class to
    implement both the interfaces. Create 5 objects of the class, store it in Vector and display the result
    of the vector. */

// Ankit Savani (21CE122)

import java.util.Scanner;
import java.util.Vector;

interface IPrinter {
    int print();
}

interface IScanner {
    void scan();
}

class ConcretedClass implements IPrinter, IScanner {
    Scanner objScanner = new Scanner(System.in);
    int assumedVar;

    public void scan() {
        assumedVar = objScanner.nextInt();
    }

    public int print() {
        return assumedVar;
    }
}

class Pr_3_2 {
    public static void main(String[] args) {
        Vector<ConcretedClass> vectorOfConcretedClass = new Vector<ConcretedClass>(5);
        for (int i = 0; i < 5; i++) {
            vectorOfConcretedClass.add(new ConcretedClass());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Value of Variable in object " + (i + 1) + ": ");
            vectorOfConcretedClass.get(i).scan();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of Variable in object " + (i + 1) + " is " + vectorOfConcretedClass.get(i).print());
        }
    }
}