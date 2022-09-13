//  Write a java program which shows importing of classes from other user definepackages.

// Ankit Savani (21CE122)

package Pr_3_5;

import java.util.Scanner;

public class Pr_five {
    public void getYourName(String name) {
        System.out.println("Name : " + name);
    }

    public void getId(String idNo) {
        System.out.println("Id : " + idNo);
    }

public void getDepartment(String d){
System.out.println("Department : " + d);

}

    public void getCurrSemester(int sem) {
        System.out.println("Current Semester : " + sem);
    }

    public void getAllDetails(String name, String idNo, String d, int sem) {
        getYourName(name);
        getId(idNo);
        getDepartment(d);
        getCurrSemester(sem);
    }

    public static void main(String[] args) {
        Pr_five obj = new Pr_five();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your id number : ");
        String id = sc.nextLine();
        System.out.println("Enter your department : ");
        String department = sc.nextLine();
        System.out.println("Enter your current semester : ");
        int semester = sc.nextInt();
        obj.getAllDetails(name, id, department, semester);
        sc.close();
    }
}