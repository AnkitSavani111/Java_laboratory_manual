// Write a program that illustrates the significance of interface default method.

package Pr_3_7;

public interface Pr_3_7 {
    int totalC = 500;

    default void totalCost() {
        System.out.println("Total Cost : " + totalC);
    }
    abstract void placeOreder();
}

