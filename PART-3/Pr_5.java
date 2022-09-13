
import Pr_3_5.Pr_five;
import java.util.Scanner;

public class Pr_5 {
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
