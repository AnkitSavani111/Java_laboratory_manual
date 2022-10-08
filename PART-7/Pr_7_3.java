/*     
        Personal Loan Eligibility Criteria for Salaried Applicant is as follows:
    Eligible Age Group - 21 years to 60 years
    Minimum Net Monthly income - Rs. 15,000
    Minimum Total Work Experience - 1 year
    Citizenship – Indian
    Create a class AccountHolder to store above given information entered by a user. Create 5
    objects of AccountHolder class and store them in an ArrayList. Display names of account
    holders , who are eligible to get a loan based on given criteria.
*/

//  Ankit Savani (21CE122)

import java.util.*;

class AccountHolder {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int WorkExperience;
    double income;
    Boolean Citizenship;

    void info() {
        System.out.println("Enter Your Name : ");
        name = sc.next();
        System.out.println("Enter Your Age : ");
        age = sc.nextInt();
        System.out.println("Enter Your Net Monthly income : ");
        income = sc.nextDouble();
        System.out.println("Enter Your Total Work Experincome (In Year Format) : ");
        WorkExperience = sc.nextInt();
        System.out.println("What is Your CitizenShip? (For Indian true otherwisw false) :- ");
        Citizenship = sc.nextBoolean();

    }
}

public class Pr_7_3 extends AccountHolder {

    
    public static void main(String[] args) {
        int count = 0;
        ArrayList a = new ArrayList<>();
        ArrayList<AccountHolder> personHolder = new ArrayList<AccountHolder>();
        for (int i = 1; i <= 5; i++) {
            personHolder.add(new AccountHolder());
        }

        // If you want user input, do it in the loop below
        for (AccountHolder p : personHolder) {
            p.info();
            if (p.age >= 21 && p.age <= 60 && p.income >= 15000 && p.WorkExperience >= 1 && p.Citizenship == true) {
                System.out.println("You are Elligeble  for loan ");
                count++;
                a.add(p.name);
            } else {
                System.out.println("You Are Not Elligeble for Loan  !!!");
            }
        }
        System.out.println("The Number of Elligeble Candidates : " + count);
        System.out.println("The Number of Not Elligeble Candidates : " + (5 - count));
        System.out.println("All Eligible Candidates Are : " + a);
    }
}