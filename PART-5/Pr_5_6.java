/*
    Write a program to demonstrate methods of wrapper class.
*/

// Ankit Savani (21CE122)

public class Pr_5_6 {
    public static void main(String[] args)
    {
        // valueOf() method
        Integer I = Integer.valueOf("10"); 
        System.out.println(I);
        
        Double D = Double.valueOf("10.0"); // Double.valueOf() method
        System.out.println(D);
        
        Boolean B = Boolean.valueOf("true"); 
        System.out.println(B);

        Integer C = Integer.valueOf("1111", 2); // Binary to Decimal
        System.out.println(C);

        int i = Integer.parseInt("10"); // Interger.parseInt() method
        System.out.println(i);

        double d = Double.parseDouble("10.5"); // Double.parseDouble() method
        System.out.println(d);

        boolean b = Boolean.parseBoolean("true"); // Boolean.parseBoolean() method
        System.out.println(b);

        int bD = Integer.parseInt("1000", 2); // Binary to Decimal
        System.out.println(bD);

        // toString() method
        Integer In = new Integer(10);
        String s = In.toString();
        System.out.println(s);
    }
}
