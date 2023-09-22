package week6;

import java.util.Scanner;

public class Question_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=input.nextLine();

        System.out.println(translateNumber(str));
    }

    public static String translateNumber(String str){
        String output="";
        for(int i=0;i<str.length();i++){
            if(getNumber(str.charAt(i))==0){
                output += str.charAt(i);
            }
            else {
                output += getNumber(str.charAt(i));
            }
        }
        return output;
    }
    public static int getNumber(char ch){
        if("abcABC".contains(ch+"")){
            return 2;
        }
        else if ("defDEF".contains(ch+"")) {
            return 3;
        }
        else if ("ghiGHI".contains(ch+"")) {
            return 4;
        }
        else if ("jklJKL".contains(ch+"")) {
            return 5;
        }
        else if ("mnoMNO".contains(ch+"")) {
            return 6;
        }
        else if ("pqrsQPRS".contains(ch+"")) {
            return 7;
        }
        else if ("tuvTUV".contains(ch+"")) {
            return 8;
        }
        else if ("wxyzWXYZ".contains(ch+"")) {
            return 9;
        }
        return 0;
    }
}
