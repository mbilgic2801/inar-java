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
        boolean[] isUpperCase=new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if(charArray[i]>='A'&&charArray[i]<='Z'){
                isUpperCase[i]=true;
            }
            charArray[i]=str.charAt(i);

        }
        
        for(int i=0;i<str.length();i++){
            char min=charArray[i];
            boolean tempBoolean=isUpperCase[i];
            for(int j=i+1;j<str.length();j++){
                if(min>charArray[j]){
                    min=charArray[j];
                    tempBoolean=isUpperCase[j];
                    charArray[j]=charArray[i];
                    isUpperCase[j]=isUpperCase[i];
                    charArray[i]=min;
                    isUpperCase[i]=tempBoolean;
                }
            }
        }
        String strTemp="";
        for (int i = 0; i < str.length(); i++) {
            if(isUpperCase[i]){
                strTemp+=(Character.toUpperCase(charArray[i]));
            }
            else {
                strTemp+=charArray[i];
            }
        }
        return strTemp;
    }
}
