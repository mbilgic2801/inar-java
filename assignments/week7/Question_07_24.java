package week7;


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Question_07_24 {
    public static void main(String[] args) {
        int[] cards=new int[52];

        for(int i=0;i< cards.length;i++){
            cards[i]=i;
        }
        String[] pickedCards=new String[4];
        int counter=0;
        while (!isFourCardFromEachSuit(pickedCards)){
            pickCards(cards,pickedCards);
            printArray(pickedCards);
            counter++;
            System.out.println("*************************");
        }
        System.out.println("Number of picks: "+counter);
    }

    public static boolean isFourCardFromEachSuit(String[] pickedCards){
        String str= Arrays.toString(pickedCards);
        return (str.contains("Clu")&&str.contains("Hea")&&
                str.contains("Dia")&&str.contains("Spa"));

    }
    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void pickCards(int[] cards,String[] pickedCards) {
        for(int i=0;i<pickedCards.length;i++) {
            pickACard(cards,pickedCards,i);
        }
    }
    public static void pickACard(int[] cards,String[] pickedCards,int index){
        int randomCardNumber=(int)(Math.random()*52);
        String cardSuit=cardSuit(randomCardNumber);
        String cardValue=cardValue(randomCardNumber);
        pickedCards[index]=cardValue+" of "+cardSuit;

    }
    public static String cardValue(int number){
        int value=number%13;
        if(value==0){
            return "King";
        }
        if(value==1){
            return "Ace";
        }
        else if(value==12){
            return "Queen";
        }
        else if(value==11){
            return "Jack";
        }
        else{
            return ""+value;
        }
    }
    public static String cardSuit(int number){
        switch (number/13){
            case 0: return "Spades";
            case 1: return "Clubs";
            case 2: return "Diamonds";
            case 3: return "Hearts";
        }
        return "-1";
    }
}
