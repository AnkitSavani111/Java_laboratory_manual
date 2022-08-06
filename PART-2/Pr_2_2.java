/*  Problem: 

    Design a class named Account that contains:
    • A private int data field named id for the account (default 0).
    • A private double data field named balance for the account (default 500₹).
    • A private double data field named annualInterestRate that stores the current
    interest rate (default 7%). Assume all accounts have the same interest rate.
    • A private Date data field named dateCreated that stores the date when the
    account was created.
    • A no-arg constructor that creates a default account.
    • A constructor that creates an account with the specified id and initial balance.
    • The accessor and mutator methods for id, balance, and annualInterestRate.
    • The accessor method for dateCreated.
    • A method named getMonthlyInterestRate() that returns the monthly interest rate.
    • A method named getMonthlyInterest() that returns the monthly interest.
    • A method named withdraw that withdraws a specified amount from the account.
    • A method named deposit that deposits a specified amount to the account.
*/

// Ankit Savani (21CE122)

class Pr_2_2 {
    public static void main(String[] args) {
        Account objAccount = new Account();
        objAccount.setId(25);
        objAccount.setBalance(1000);
        objAccount.setAnnualInterestRate(7);
        objAccount.getMonthlyInterest();
        objAccount.deposit(300);
        objAccount.withdraw(250);
        objAccount.getAccountDetailes();
    }
}

class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    // Printing details
    public void getAccountDetailes() {
        System.out.println("ID :" + getId());
        System.out.println("Balance : " + getBalance());
        System.out.println("Annual Interest Rate : " + Account.getAnnualInterestRate());
        System.out.println("Monthly interest is " + getMonthlyInterest());
        System.out.println("The account was created on  " + getDateCreated());
    }
}
