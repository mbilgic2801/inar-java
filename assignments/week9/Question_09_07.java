package week9;

import java.util.Date;

public class Question_09_07 {
    public static void main(String[] args) {
        Account_09_07 a=new Account_09_07(1122,20000);
        a.setAnnualInterestRate(4.5/100);
        a.withdraw(2500);
        a.deposit(3000);
        a.accountStatement();


    }
}
