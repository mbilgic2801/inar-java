package week5;

import java.util.Scanner;

public class Question_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counterOfVowels = 0;
        int counterOfConsonants = 0;
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String newFormOfStr = str.toUpperCase();
        for(int i=0;i<str.length();i++){
            char a = newFormOfStr.charAt(i);
            if(a<='Z'&&a>='A'){
                if(a==(int)'A'||a==(int)'E'||a==(int)'I'||a==(int)'O'||a==(int)'U'){
                    counterOfVowels++;
                }
                else {
                    counterOfConsonants++;
                }
            }
        }
        System.out.println("The number of vowels is "+counterOfVowels);
        System.out.println("The number of consonants is " + counterOfConsonants);
        System.out.println(str);
        System.out.println(newFormOfStr);
        System.out.println(str.length());
    }
}
