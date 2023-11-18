package week11;

public class Question_11_08 {
    public static void main(String[] args) {
        Account_11_08 george=new Account_11_08(1122,"George",1000);
        george.setAnnualInterestRate(1.5);
        george.deposit(30);
        george.deposit(40);
        george.deposit(50);
        george.withdraw(5);
        george.withdraw(4);
        george.withdraw(2);
        System.out.println(george.getTransactions().toString());
    }
}
