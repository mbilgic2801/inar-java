package week11;

import week9.Account_09_07;

public class CheckingAccount extends Account_09_07 {
    double overdraftLimit;
    public CheckingAccount() {
        super();
    }
public String toString(){
    return  "ID :"+getId()+"\n"+
            "Balance is $"+getBalance()+"\n"+
            "Limit is $-"+overdraftLimit;
}
    public CheckingAccount(int id, double balance,double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit=overdraftLimit;
    }
}
