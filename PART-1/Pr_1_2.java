/*  Problem: 

    Given a string, return a string made of the first 2 chars (if present), however include
    first char only if it is 'o' and include the second only if it is 'z', so "ozymandias"
    yields "oz".

    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o" 
*/

// Ankit Savani (21CE122)

import java.util.Scanner;

public class Pr_1_2 {

    public static void main(String arguments[]) {

        Scanner obj_sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = obj_sc.nextLine();

        String answer = startOz(str);
        System.out.println(answer);
        obj_sc.close();
    }

    public static String startOz(String checkOZ) {
        String answerString = "";
        if (checkOZ.charAt(0) == 'o')
            answerString = answerString + 'o';

        if (checkOZ.charAt(1) == 'z')
            answerString = answerString + 'z';

        return answerString;
    }
}