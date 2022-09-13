// Write a program that demonstrates use of packages & import statements.

package Pr_3_6;

import java.util.*;

public class Pr_3_6 {
    String name, id, dep;

    public void setInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student : ");
        name = sc.next();
        System.out.println("Enter your ID : ");
        id = sc.next();
        System.out.println("Enter the department : ");
        dep = sc.next();
        sc.close();
    }

    public void getInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Department : " + dep);
    }
}