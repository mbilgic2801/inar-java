package week5;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = input.nextLine();
        String vowels = "aeıioöuüAEIİOÖUÜ";
        int counter = 0;
        for(int i=0;i<str.length();i++){
            if(vowels.contains(""+str.charAt(i))){
                counter++;
            }
        }
        System.out.printf("\nThere are %d vowels",counter);
    }
}
