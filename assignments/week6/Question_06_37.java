package week6;

import java.util.Scanner;

public class Question_06_37 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number and its width: ");
        int number=input.nextInt();
        int width=input.nextInt();
        System.out.printf("%d formatted to width %d: %s",number,width,format(number,width));
    }
    public static String format(int number,int width){
        String num=""+number;
        if((num.length()>=width)){
            return num;
        }
        String newFormat="";
        for(int i=num.length();i<width;i++){
            newFormat+="0";
        }
        return newFormat+num;
    }
}
