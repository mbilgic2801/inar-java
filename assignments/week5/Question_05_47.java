package week5;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn12=input.nextLine();
        int sum=0;
        boolean isValid=true;
        for (int i=0;i<isbn12.length();i++){
            if (!(Character.isDigit(isbn12.charAt(i))&&isbn12.length()==12)){
                isValid=false;
                break;
            }
            if(i%2==0){
                sum += 3*Integer.parseInt(isbn12.charAt(i)+"");
            }
            else {
                sum += Integer.parseInt(isbn12.charAt(i)+"");
            }
        }
        if(isValid) {
            sum = 10 - sum % 10;
            if (sum == 10)
                sum = 0;
            isbn12 += sum;
            System.out.println("The ISBN-13 number is " + isbn12);
        }
        else {
            System.out.println(isbn12+" is an invalid input");
        }
    }
}
