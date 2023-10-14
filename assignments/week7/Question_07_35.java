package week7;

import java.util.Scanner;

public class Question_07_35 {
    //Bir kelime dizimiz olacak
    //oyun başladığında BU diziden bir kelime seçilecek
    //ve oyuncudan sırayla harf denemeleri alınacak
    //ççoktan çıkan harflerde ve olmayan harflerde ilgili notlar çıkacak
    //kelime bilindiğinde kaç tane hakkın boşa gittiği gösterilecek
    //oyun sonunda oyunu tekrar oynamak isteyip istemediği sorulacak ona göre devam edilecek
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String[] words={"program","java","object"};
        playGame(words);

    }

    private static void playGame(String[] words) {
        Scanner input =new Scanner(System.in);
        String actualWord=words[(int)(Math.random()* words.length)];
        String temp="";
        for (int i = 0; i < actualWord.length(); i++) {
            temp+="*";
        }
        int missCounter=0;
        String guess;
        while(!actualWord.equals(temp)){
            System.out.printf("(Guess) Enter a letter in word %s > ",temp);
            guess=input.next();
            if(!actualWord.contains(guess)){
                missCounter++;
            }
            for(int i=0;i<actualWord.length();i++){
                if(actualWord.charAt(i)==guess.charAt(0)){
                    temp=temp.substring(0,i)+guess+temp.substring(i+1);
                }
            }
        }
        System.out.printf("The word is %s. You missed %d time%s\n",actualWord,missCounter,(missCounter>1?"s":""));
        System.out.println("Do you want to guess another word? Enter y or n>");
        if(input.next().equals("y")){
            playGame(words);
        }
        else{
            System.out.println("Bye!");
        }
    }
}
