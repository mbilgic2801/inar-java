package week11;

import java.util.ArrayList;
import java.util.Date;

public class Account_11_08 {
    private int id;
    private String name;
    private ArrayList<Transactions_11_08> transactions = new ArrayList<>();

    public Account_11_08(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    private double balance;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account_11_08() {
        this.dateCreated = new Date();
    }

    public Account_11_08(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public String toString() {
        return "ID :" + id + "\n" +
                "Balance is $" + balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double w) {
        balance -= w;
        transactions.add(new Transactions_11_08(new Date(),'W',w,balance,"para çektim"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transactions_11_08> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transactions_11_08> transactions) {
        this.transactions = transactions;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void deposit(double d) {
        balance += d;
        transactions.add(new Transactions_11_08(new Date(),'D',d,balance,"para yatırdım"));

    }

    public void accountStatement() {
        System.out.println("          Account Statement :");
        System.out.println("------------------------------------------");
        System.out.printf("Account ID    :%d\n", this.id);
        System.out.printf("Date created  :%s\n", this.getDateCreated().toString());
        System.out.printf("Balance       :%.2f\n", this.balance);
        System.out.printf("Monthly Interest:%.2f\n", this.getMonthlyInterest());

    }
}
