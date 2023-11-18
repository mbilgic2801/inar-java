package week11;

import java.util.Date;

public class Transactions_11_08 {
    private Date date=new Date();
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transactions_11_08(Date date, char type, double amount, double balance, String description) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String toString(){
        return "\nDate: "+date.toString()+"\n"+
               "Transaction type: "+(type=='W'?"Withdraw":"Deposit")+"\n"+
               "Amount: "+amount+"\n"+
               "Balance: "+balance+"\n"+
               "Description: "+ description+"\n";
    }
}
