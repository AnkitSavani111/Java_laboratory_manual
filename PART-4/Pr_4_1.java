/* 
    Write a program to show the try - catch block to catch the different types of exception.
*/

// Ankit Savani (21CE122)

import java.util.*;

class Pr_4_1 {
    public static void main(String[] args) {
        try {               // ArithmeticException
            System.out.println(2/0);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        try {               // ArrayIndexOutOfBoundsException
            excetest();
        }
        catch(ArrayIndexOutOfBoundsException a) {
            System.out.println(a);
        }
        try                         // NullPointerException
        {
            String ptr = null;
            if (ptr.equals("Doono"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print(e);
        }
        try {                       // StringIndexOutOfBoundsException
            String a = "This is like chipping "; 
            char c = a.charAt(24); 
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    static void excetest(){
        int[] arr = new int[10];
        System.out.println(arr[11]);      
    }
}
