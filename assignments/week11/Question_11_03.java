package week11;

import week11.CheckingAccount;
import week11.SavingsAccount;
import week9.Account_09_07;

public class Question_11_03 {
    public static void main(String[] args) {
        Account_09_07 ali=new Account_09_07(33,5555);
        SavingsAccount ahmet=new SavingsAccount(16,4820);
        CheckingAccount mehmet=new CheckingAccount(11,1450,500);
        System.out.println(ali.toString()+"\n---------------");
        System.out.println(mehmet.toString()+"\n---------------");
        System.out.println(ahmet.toString());

    }
}
