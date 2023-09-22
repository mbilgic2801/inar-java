package week6;

import java.util.Scanner;

public class CeaserMethod1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = input.nextLine();

        System.out.println("Enter the key as an integer:");
        int key = input.nextInt();
        System.out.println(ceaserCypher(str,key));
    }
    public static String ceaserCypher(String str,int key){
        String strNew="";
        for (int i = 0; i < str.length(); i++) {

            char chr = str.charAt(i);

            if (Character.isUpperCase(chr) && Character.isLetter(chr)){
                strNew += (char)((chr - 'A' + key) % 26 + 'A') + "";

            } else if (Character.isLowerCase(chr) && Character.isLetter(chr)) {
                strNew += (char)((chr - 'a' + key) % 26 + 'a') + "";
            } else {
                strNew += chr + "";
            }
        }
        return strNew;
    }
}
