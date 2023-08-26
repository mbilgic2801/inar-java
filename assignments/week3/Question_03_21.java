package week3;

import java.util.Scanner;

public class Question_03_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfYear;
        int numberOfMonth;
        int numberOfDay;
        int numberOfCentury;
        int numberOfYearOfCentury;
        int nameOfDay;
        String dayName="";
        System.out.print("Enter year: (e.g. 2012) : ");
        numberOfYear = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        numberOfMonth = input.nextInt();
        if(numberOfMonth==1){
            numberOfMonth = 13;
            numberOfYear -=1;
        }
        if(numberOfMonth==2){
            numberOfMonth = 14;
            numberOfYear -=1;
        }
        System.out.print("Enter the day of the month: 1-31: ");
        numberOfDay = input.nextInt();
        numberOfCentury = numberOfYear / 100;
        numberOfYearOfCentury = numberOfYear % 100;
        nameOfDay = ( numberOfDay + ((numberOfMonth+1)*26)/10 + numberOfYearOfCentury + numberOfYearOfCentury/4 + numberOfCentury/4 + 5 * numberOfCentury ) % 7;
        switch (nameOfDay){
            case 0: dayName="Saturday"; break;
            case 1: dayName="Sunday"; break;
            case 2: dayName="Monday"; break;
            case 3: dayName="Tuesday"; break;
            case 4: dayName="Wednesday"; break;
            case 5: dayName="Thursday"; break;
            case 6: dayName="Friday"; break;
        }
        System.out.println("Day of the week is " + dayName);
    }
}
