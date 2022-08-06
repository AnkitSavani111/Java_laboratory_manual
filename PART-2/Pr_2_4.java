/*
	(Subclasses of Account) In Programming Exercise 2, the Account class was
	defined to model a bank account. An account has the properties account number,
	balance, annual interest rate, and date created, and methods to deposit and
	withdraw funds. Create two subclasses for checking and saving accounts. A
	checking account has an overdraft limit, but a savings account cannot be
	overdrawn. Draw the UML diagram for the classes and then implement them.
	Write a test program that creates objects of Account, SavingsAccount, and
	CheckingAccount and invokes their toString() methods.
*/

// Ankit Savani (21CE122)

import java.util.*;

public class Pr_2_4 {
    // Main method
    public static void main(String[] arguments) {
        // Create Account, SavingsAccount and Checking Account objects
        Account account = new Account(1, 20000);
        SavingsAccount savings = new SavingsAccount(2, 10000);
        CheckingAccount checking = new CheckingAccount(3, 20000, -50);

        // Set annual interest rate of 4.5%
        account.setAnnualInterestRate(5);
        savings.setAnnualInterestRate(5);
        checking.setAnnualInterestRate(5);

        // Withdraw 2,500 Rs
        account.withdraw(2500);
        savings.withdraw(2000);
        checking.withdraw(2500);

        // Deposit 3,000 Rs
        account.deposit(3000);
        savings.deposit(3000);
        checking.deposit(3000);

        // Invoke toString methods
        System.out.println(account.toString());
        System.out.println(savings.toString());
        System.out.println(checking.toString());
    }
}

class Account {
    // Data fields
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    // Constructors
    /* Creates a default account */

    Account() {
        this(0, 0);
    }

    /** Creates an account with the specified id and initial balance */
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // Mutator methods
    /* Set id */
    public void setId(int id) {
        this.id = id;
    }

    /* Set balance */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /* Set annualInterestRate */
    public void setAnnualInterestRate(double Ar) {
        annualInterestRate = Ar;
    }

    // Accessor methods
    /* Return id */
    public int getId() {
        return id;
    }

    /* Return balance */
    public double getBalance() {
        return balance;
    }

    /* Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /* Return dateCreated */
    public String getDateCreated() {
        return dateCreated.toString();
    }

    /* Return monthly interest rate */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Methods
    /* Return monthly interest */
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    /* Decrease balance by amount */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /* Increase balance by amount */
    public void deposit(double amount) {
        balance += amount;
    }

    /** Return a String decription of Account class */
    public String toString() {
        return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
                + "\nBalance: Rs " + balance +
                "\nMonthly interest: Rs " + getMonthlyInterest();
    }
}

class SavingsAccount extends Account {

    /** Construct a default CheckingAccount object */
    public SavingsAccount() {
        super();
    }

    /** Construct a SavingsAccount with specified id, balance */
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    /* Decrease balance by amount */
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        } else
            System.out.println(
                    "Error! Savings account overdrawn transtaction rejected");
    }

    public String tostrString() {
        return super.toString();
    }
}

class CheckingAccount extends Account {
    // Data fields
    private double overdraftLimit;

    /* Construct a default CheckingAccount object */
    public CheckingAccount() {
        super();
        overdraftLimit = -50;
    }

    /* Construct a CheckingAccout with specified id, balance and overdraftLimit */
    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    /* Set a new overdraft limit */
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Return overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Decrease balance by amount
    public void withdraw(double amount) {
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        } else
            System.out.println("Error! Amount exceeds overdraft limit.");
    }

    /* Return a String decription of CheckingAccount class */
    public String toString() {
        return super.toString() + "\nOverdraft limit: Rs " +
                String.format("%.2f", overdraftLimit);
    }
}

