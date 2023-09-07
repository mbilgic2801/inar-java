package week5;

import java.util.Scanner;

public class Quiz_02 {
    public static void main(String[] args) {
        //String input string sayı içeriyorsa a2pp3le
        Scanner input = new Scanner(System.in);
        String firstString=input.nextLine();
        String secondString="";

        for (int i=0;i<firstString.length();i++){
            if(Character.isDigit(firstString.charAt(i))){
                for(int j=Integer.parseInt(""+firstString.charAt(i));j>0;j--){
                    secondString += firstString.charAt(i+1);
                }
            }
        }
        System.out.println(secondString);
    }
}
