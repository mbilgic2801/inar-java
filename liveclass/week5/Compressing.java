package week5;

import java.util.Scanner;

public class Compressing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine()+" ";
        String output = "";
        int counter = 1;
        for(int i=0;i<str.length()-1;i++){

            if(str.charAt(i)==str.charAt(i+1)){
                counter++;
            }
            else {
                output += str.charAt(i) + "" + counter;
                counter = 1;
            }
        }
        System.out.println(output);
    }
}
