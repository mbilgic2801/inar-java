package week6;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        if(isValid(password)){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValid(String str) {
        if(is8CharOrMore(str)&&onlyLetterOrDigit(str)&&is2DigitOrMore(str)){
            return true;
        }
        return false;
    }
    public static boolean is8CharOrMore(String str){
        if(str.length()>=8){
            return true;
        }
        return false;
    }
    public static boolean onlyLetterOrDigit(String str){
        boolean bool=true;
        for(int i=0;i<str.length();i++){
            if(!(Character.isLetter(str.charAt(i))||Character.isDigit(str.charAt(i )))){
                bool=false;
                break;
            }
        }
        return bool;
    }

    public static boolean is2DigitOrMore(String str){
        int counter=0;
        for (int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        if(counter>=2){
            return true;
        }
        return false;
    }
}
