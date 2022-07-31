/*  Problem: 

    Given an array of strings, return a new array without the strings that are equal to
    the target string. One approach is to count the occurrences of the target string, make
    a new array of the correct length, and then copy over the correct strings.
    wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
    wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
    wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
*/

// Ankit Savani (21CE122)

import java.util.Scanner;

public class Pr_1_6 {
    public static void main(String[] args) {
        Scanner obj_sc = new Scanner(System.in);
        System.out.print("Enter size of the Array : ");
        int arrSize = obj_sc.nextInt();
        String[] arr = new String[arrSize];
        System.out.print("Enter Strings : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj_sc.next();
        }
        System.out.print("Enter string which you want to remove from main string: ");
        String removeString = obj_sc.next();
        wordsWithout(removeString, arr);
        obj_sc.close();
    }

    static void wordsWithout(String removeString, String arr[]) {
        // Count equal strings
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(removeString)) {
                count++;
            }
        }

        // Define new size by counting equal elements
        String[] ansString = new String[arr.length - count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(removeString)) {
                ansString[j] = arr[i];
                j++;
            }
        }

        // Printing elements after removing Entered string
        System.out.println("String after removing entered string element : ");
        for (String element : ansString) {
            System.out.println(element);
        }

    }
}