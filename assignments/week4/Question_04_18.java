package week4;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String majorAndStatus = input.next();
        String major = majorAndStatus.substring(0,1);
        String status = majorAndStatus.substring(1,2);
        String message = "";
        if( "MCI".contains( major ) && "1234".contains( status ) ){
            if(major.equals("M"))
                message = "Mathematics ";
            if(major.equals("C"))
                message = "Computer Science ";
            if(major.equals("I"))
                message = "Information Technology ";
            if(status.equals("1"))
                message = message + "Freshman";
            if(status.equals("2"))
                message = message + "Sophomore";
            if(status.equals("3"))
                message = message + "Junior";
            if(status.equals("4"))
                message = message + "Senior";
        }
        else
            message = "Invalid input";
        System.out.println(message);



    }
}
