/*  Problem:

    Given 2 strings, a and b, return the number of the positions where they contain the
    same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
    and "az" substrings appear in the same place in both strings.
    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0
*/

// Ankit Savani (21CE122)

import java.util.Scanner;
import static java.lang.Math.min;

public class Pr_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String str1 = sc.next();
        System.out.println("Enter second string : ");
        String str2 = sc.next();
        int str3 = stringMatch(str1, str2);
        System.out.println(str3);
        sc.close();
    }

    public static int stringMatch(String str1, String str2) {
        int count = 0;
        int f = min(str1.length(), str2.length());
        for (int i = 0; i < f - 1; i++) {
            String subStringOfStr1 = str1.substring(i, i + 2);
            String subStringfOfStr2 = str2.substring(i, i + 2);

            // Comparing sub strings
            if (subStringOfStr1.equals(subStringfOfStr2)) {
                count++;
            }
        }
        return count;
    }
}