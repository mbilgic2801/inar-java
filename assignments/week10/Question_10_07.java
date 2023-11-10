package week10;

import week9.Account_09_07;

import java.util.Scanner;

public class Question_10_07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Account_09_07[] customers=new Account_09_07[10];
        for (int i = 0; i < customers.length; i++) {
            customers[i]=new Account_09_07(i,100);
        }
        logIn(customers);
    }

    public static void logIn(Account_09_07[] customers) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an id: ");
        int id=input.nextInt();
        int counter=-1;
        for (int i = 0; i < customers.length; i++) {
            if(id==customers[i].getId()){
                counter=i;
                break;
            }
        }
        if(counter>-1){
            mainMenu(customers[counter],customers);
        }
        else{
            System.out.println("Invalid ID");
            logIn(customers);
        }
    }

    public static void mainMenu(Account_09_07 customer,Account_09_07[] customers) {
        Scanner input=new Scanner(System.in);
        System.out.println("Main Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit");
        System.out.print("Enter a choice: ");
        int choice=input.nextInt();
        if(choice<1||choice>4){
            System.out.println("Invalid input");
            mainMenu(customer,customers);
        }
        else if (choice==1) {
            System.out.println(customer.getBalance());
            mainMenu(customer,customers);
        }
        else if (choice==2) {
            System.out.print("Enter an amount to withdraw: ");
            double withdraw=input.nextDouble();
            if(customer.getBalance()<withdraw){
                System.out.println("you withdrew just "+customer.getBalance()+" due to your balance");
                customer.setBalance(0);
                mainMenu(customer,customers);
            }
            else{
                customer.setBalance(customer.getBalance()-withdraw);
                mainMenu(customer,customers);
            }
        }
        else if(choice==3){
            System.out.print("Enter an amount to deposit: ");
            double deposit=input.nextDouble();
            customer.setBalance(customer.getBalance()+deposit);
            mainMenu(customer,customers);
        }
        else {
            logIn(customers);
        }
    }
}
