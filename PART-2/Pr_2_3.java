/*  Problem:

    Use the Account class created as above to simulate an ATM machine.
    Create 10 accounts with id AC001.....AC010 with initial balance 300₹. The
    system prompts the users to enter an id. If the id is entered incorrectly, ask
    the user to enter a correct id. Once an id is accepted, display menu with
    multiple choices.
    1. Balance inquiry
    2. Withdraw money [Maintain minimum balance 300₹]
    3. Deposit money
    4. Money Transfer
    5. Create Account
    6. Deactivate Account
    7. Exit
    Hint: Use ArrayList, which is can shrink and expand with compared to Array.
*/

// Ankit Savani (21CE122)

import java.util.*;

public class Pr_2_3 {
    public static void main(String[] arguments) {
        Scanner obj = new Scanner(System.in);
        String id;
        String id2;
        boolean flag = true;
        int choice;
        double amt;
        ArrayList<AnyTimeMachine> people = new ArrayList<AnyTimeMachine>();
        for (int i = 1; i <= 10; i++) {
            people.add(new AnyTimeMachine());
        }
        System.out.print("Enter Your Account Number : ");
        id = obj.next();
        int userNumber = userID(id, people);
        while (flag) {
            System.out.println();
            System.out.println("Make a choice......");
            System.out.println("1.Balance inquiry ");
            System.out.println("2.Withdraw money ");
            System.out.println("3.Deposit money");
            System.out.println("4.Money Transfer ");
            System.out.println("5.Create Account ");
            System.out.println("6.Deactivate Account");
            System.out.println("7.Exit ");
            choice = obj.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Account Number : " + id);
                    System.out.println("Current Balance : " + people.get(userNumber).getBalance());
                }
                case 2 -> {
                    System.out.print("Enter Amount To Withdraw : ");
                    amt = obj.nextDouble();
                    people.get(userNumber).withdraw(amt);
                }
                case 3 -> {
                    System.out.print("Enter Amount To Deposit : ");
                    amt = obj.nextInt();
                    people.get(userNumber).deposit(amt);
                }
                case 4 -> {
                    System.out.print("Enter Account Number To Transfer Money :");
                    id2 = obj.next();
                    int u2 = userID(id2, people);
                    System.out.print("Enter Amount To Transfer : ");
                    amt = obj.nextInt();
                    people.get(userNumber).MoneyTransfer(people.get(u2), amt);
                }
                case 5 -> {
                    people.add(new AnyTimeMachine());
                    System.out.println("Account Created Successfully.");
                    System.out.println("The New Account Number Is :" + people.get(people.size() - 1).getId());
                }
                case 6 -> {
                    people.remove(userNumber);
                    System.out.println("Account Deleted Successfully.");
                }
                case 7 -> flag = false;
                default -> System.out.println("Make a valid choice..");
            }
        }

        obj.close();
    }

    public static int userID(String id, ArrayList<AnyTimeMachine> people) {
        int user = 0;
        int i;
        for (i = 0; i < people.size(); i++) {
            if (id.equals(people.get(i).getId())) {
                user = i;
                break;
            }
        }
        return user;
    }
}

class AnyTimeMachine {
    private final String id;
    private double balance;

    private static int count = 0;

    public AnyTimeMachine() {
        count++;
        if (count < 10) {
            id = "AC00" + (count);
        } else {
            id = "AC0" + (count);
        }
        balance = 300;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double money) {
        if (balance - money >= 300) {
            balance -= money;
            System.out.println(money + " Rs successfully withdrawn.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw the amount.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "Rs deposited to your account.");
        System.out.println("Current Balance is : " + balance);
    }

    public void MoneyTransfer(AnyTimeMachine obj, double amount) {
        if (balance - amount >= 300) {
            balance -= amount;
            obj.balance += amount;
            System.out.println(amount + " Rs successfully Transferred.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance to transfer the amount.");
        }
    }
}