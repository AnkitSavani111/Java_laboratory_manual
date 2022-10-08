/*
    Create a generic method for sorting an array of Comparable objects.
*/

// Ankit Savani (21CE122)

import java.util.*;

public class Pr_7_1 {
    public <E extends Comparable<E>> void sort(E[] ar) {
        E swap;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i].compareTo(ar[j]) > 0) {
                    swap = ar[i];
                    ar[i] = ar[j];
                    ar[j] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        Pr_7_1 t = new Pr_7_1();

        Integer[] arr = { 3, 4, 1, 2, 5 };
        t.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] countries = { "India", "Zimbabwe", "SouthAfrica", "America", "Yugoslavia", " Australia", "Denmark",
                "France", "Netherlands", "Italy", "Germany" };
        t.sort(countries);
        System.out.println(Arrays.toString(countries));
    }
}