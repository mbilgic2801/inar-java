package week7;

import java.util.Scanner;

public class Question_07_33 {
    // bir yıl girilecek ve çin takvimine göre hangi yıl olduğu çıktı verilecek
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] animals={"Monkey","Rooster","Dog"   ,"Pig"  ,"Rat"  ,"Ox",
                          "Tiger" ,"Rabbit" ,"Dragon","Snake","Horse","Sheep"};
        System.out.print("Enter a year: ");
        int year=input.nextInt();
        System.out.printf("%d is a year of %s in zodiac",year,animals[year%12]);
    }
}
