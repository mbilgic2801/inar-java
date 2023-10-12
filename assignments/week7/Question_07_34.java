package week7;

import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string to sort: ");
        String str=input.next();
        System.out.print("sorted form: "+sort(str));
    }

    private static String sort(String str) {
        char[] charArray=new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charArray[i]=str.charAt(i);
        }

        for(int i=0;i<str.length();i++){
            char min=charArray[i];

            for(int j=i+1;j<str.length();j++){
                if(min>charArray[j]){
                    min=charArray[j];
                    charArray[j]=charArray[i];
                    charArray[i]=min;
                }
            }
        }
        String strTemp="";
        for (int i = 0; i < str.length(); i++) {
                strTemp+=charArray[i];
        }
        return strTemp;
    }
}
