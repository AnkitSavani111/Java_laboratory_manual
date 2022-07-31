/*  Problem:

    Given two non-negative int values, return true if they have the same last digit, such
    as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 %
    10 is 7.

    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
*/

// Ankit Savani (21CE122)

import java.util.Scanner;

public class Pr_1_3 {
    public static void main(String[] arguments) {
        Scanner obj_sc = new Scanner(System.in);

        System.out.print("Enter first Number : ");
        int num1 = obj_sc.nextInt();
        System.out.print("Enter second Number : ");
        int num2 = obj_sc.nextInt();

        checkLastDigit(num1, num2);
        obj_sc.close();
    }

    public static void checkLastDigit(int n1, int n2) {
        if (n1 % 10 == n2 % 10)
            System.out.println("true");

        else
            System.out.println("false");
    }
}