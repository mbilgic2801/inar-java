package week6;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.printf("The number of letters in the string \"%s\": %d",str,countLetters(str));
    }
    public static int countLetters(String str){
        int counter=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
}
