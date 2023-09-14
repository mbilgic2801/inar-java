package week6;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        // Hello world --->
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String word1="" ;
        String word2="" ;
        String output="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ' ){
                word1=str.substring(0,i);
                word2=str.substring(i+1);
                break;
            }
        }
        System.out.println(word1);
        System.out.println(word2);
        for(int i=word1.length()-1;i>=0;i--){
            output += word1.charAt(i);
        }
        output=output+" ";
        for(int i=word2.length()-1;i>=0;i--){
            output += word2.charAt(i);
        }
        System.out.println(output);
    }
}
