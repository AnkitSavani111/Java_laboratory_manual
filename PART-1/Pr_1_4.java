/*  Problem:

    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the
    array somewhere.
    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true
*/

// Ankit Savani (21CE122)

import java.util.Scanner;

public class Pr_1_4 {
    public static void main(String[] arguments) {
        Scanner obj_sc = new Scanner(System.in);
        System.out.print("Enter size of the Array : ");
        int sizeArr = obj_sc.nextInt();
        int[] arr = new int[sizeArr];
        if (sizeArr < 3) {
            System.out.println("false");
        } else {

            for (int i = 0; i < sizeArr; i++) {
                arr[i] = obj_sc.nextInt();
            }

            boolean check = array123(arr);

            if (check == true)
                System.out.println("true");

            if (check == false)
                System.out.println("false");
            obj_sc.close();
        }
    }

    public static boolean array123(int[] arru) {
        boolean c = false;

        for (int i = 0; i < arru.length - 2; i++) {
            if (arru[i] == 1) {
                if (arru[i + 1] == 2) {
                    if (arru[i + 2] == 3) {
                        c = true;
                        break;
                    }
                }
            }
        }
        return c;
    }
}