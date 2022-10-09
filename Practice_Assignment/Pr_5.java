/*
    According to question no 1, the Account class was defined to model a bank account.
    An account has the properties account number, balance, annual interest rate, and date
    created, and methods to deposit and withdraw funds. Create two subclasses for
    checking and saving accounts. A checking account has an overdraft limit, but a
    savings account cannot be overdrawn.
*/

// Ankit Savani (21CE122)

import java.util.Scanner;

class account {
    Scanner o = new Scanner(System.in);
    int count = 0;
    public int acno;
    public float bal;

    void get() {
        System.out.println("Enter The Account Number");
        acno = o.nextInt();
        System.out.println("Enter the Balance");
        bal = o.nextFloat();
    }
}

class saving extends account {
    int interestrate = 7;

    void withdraw() {
        int w;
        System.out.println("Enter the Amount you want to Withdraw");
        w = o.nextInt();
        bal = bal - w;
        System.out.println("Your New Balance is : " + bal);
        count++;
    }

    void deposite() {
        int d;
        System.out.println("Enter the Amount you Want to Deposite");
        d = o.nextInt();
        bal = bal + d;
        System.out.println("Your New Balance is : " + bal);
    }

    void checkbal() {
        System.out.println("Your Savings Balance is : " + bal + (bal * interestrate) / 100);
    }
}

class current extends account {
    int overlimit = 5000;

    void withdraw() {
        int w;
        boolean f = true;
        while (f) {
            System.out.println("Enter the Amount you want to Withdraw");
            w = o.nextInt();
            if (w > 5000) {
                System.out.println("Out Of Limit");
            } else {
                bal = bal - w;
                System.out.println("Your New Balance is : " + bal);
                f = false;
            }
        }

    }

    void deposite() {
        int d;
        System.out.println("Enter the Amount you Want to Deposite");
        d = o.nextInt();
        bal = bal + d;
        System.out.println("Your New Balance is : " + bal);
    }

    void checkbal() {
        System.out.println("Your current Balance is: " + bal);
    }
}

public class Pr_5 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        saving s = new saving();
        current c = new current();
        int i;
        int count = 0;
        int count1 = 0, cnt = 1;
        String str = "Yes";
        System.out.print("Enter 1 for saving account and 2 for current account : ");
        i = S.nextInt();

        while (str.charAt(0) == 'Y' || str.charAt(0) == 'y') {

            switch (i) {
                case 1: {
                    System.out.println("For Savings Account");
                    if (cnt == 1) {
                        s.get();
                        cnt++;
                    }
                    System.out.println("1 : Deposit");
                    System.out.println("2 : Withdraw");
                    System.out.println("3 : Check Balance");

                    int m = S.nextInt();
                    switch (m) {
                        case 1: {
                            s.deposite();
                        }
                        case 2: {
                            count++;
                            if (count <= 3)
                                s.withdraw();
                            else {
                                System.out.println("You can only withdraw for 3 times a day  :");
                                break;
                            }
                        }
                        case 3: {
                            s.checkbal();
                            break;
                        }

                    }
                }
                case 2: {
                    System.out.println("For Current Account");
                    if (cnt == 1) {
                        c.get();
                        cnt++;
                    }
                    System.out.println("1 : Deposit");
                    System.out.println("2 : Withdraw");
                    System.out.println("3 : Check Balance");

                    int n = S.nextInt();
                    switch (n) {
                        case 1: {
                            c.deposite();
                            break;
                        }
                        case 2: {
                            count1++;
                            if (count1 <= 3)
                                c.withdraw();
                            else {
                                System.out.println("You can only withdraw for 3 times a day  :");
                                break;
                            }
                        }
                        case 3: {
                            c.checkbal();
                            break;
                        }

                    }
                }
            }

            System.out.println("Do you want to continue transaction Yes or No");
            str = S.next();
            if (str.charAt(0) == 'N' || str.charAt(0) == 'n') {
                System.out.println(
                        "-----------------------------------Thank you for visiting--------------------------------------");
            }

        }

    }

}
