package week4;


import java.util.Scanner;

public class Question_04_13 {
    public static void main(String[] args) {
        //determine the all ABC letters' ASCII codes
        //determine the vowels' ASCII values
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter a letter: " );
        char letter = input.next().charAt(0);
        if( ( letter >= 'A' && letter <= 'Z' ) || ( letter >= 'a' && letter <= 'z' ) ){
            if("AEIOUaeıou".contains(Character.toString(letter)))
                System.out.println(letter+" is a vowel");
            else
                System.out.println(letter+" is a consonant");
        }
        else
            System.out.println(letter+" is an invalid input");

    }
}
