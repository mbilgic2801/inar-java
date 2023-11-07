package week9;

import java.util.Scanner;

public class Question_09_02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Stock_09_02 a=new Stock_09_02("ORCL","Oracle Corporation");
        a.previousClosingPrice=34.5;
        a.currentPrice=34.35;
        a.printStatus();


    }
}
