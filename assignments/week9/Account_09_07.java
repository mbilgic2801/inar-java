package week9;

import java.util.Date;

public class Account_09_07 {
    private int id;
    private double balance;
    private double annualInterestRate=0;
    private Date dateCreated;
    Account_09_07(){
        this.dateCreated=new Date();
    }
    Account_09_07(int id,double balance){
        this.id=id;
        this.balance=balance;
        this.dateCreated=new Date();
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
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public  void withdraw(double w){
        balance-=w;
    }
    public  void deposit(double d){
        balance+=d;
    }
    public void accountStatement(){
        System.out.println("          Account Statement :");
        System.out.println("------------------------------------------");
        System.out.printf("Account ID    :%d\n",this.id);
        System.out.printf("Date created  :%s\n",this.getDateCreated().toString());
        System.out.printf("Balance       :%.2f\n",this.balance);
        System.out.printf("Monthly Interest:%.2f\n",this.getMonthlyInterest());

    }
}
