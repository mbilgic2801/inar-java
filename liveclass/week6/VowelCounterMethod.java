package week6;

import java.util.Scanner;

public class VowelCounterMethod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=input.nextLine();
        System.out.println(vowelCounter(str));
    }
    public static int vowelCounter(String str){
        String vowels = "aeıioöuüAEIİOÖUÜ";
        int counter = 0;
        for(int i=0;i<str.length();i++){
            if(vowels.contains(""+str.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
}
