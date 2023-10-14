package week7;

import java.util.Arrays;

public class Question_07_29 {

    public static void main(String[] args) {
        int[] cards=new int[52];
        int[] sum=new int[1];

        int counter=0;
        //Question_07_31.printArray(cards);
        while (sum[0]!=4){
         pickFourCards(cards,sum);
        counter++;
        }
        System.out.println(counter+". seferde 4 ası yakaladın");
    }

    private static void pickFourCards(int[] cards,int[] sum) {
        for (int i = 0; i < 52; i++) {
            cards[i]=i%13+1;
        }
        sum[0]=0;
        String[] pickedCards=new String[4];
        for (int i = 0; i < 4; i++) {
            pickedCards[i]=pickACard(cards,sum);
        }
        //System.out.println(Arrays.toString(pickedCards)+"  "+sum[0]);
        System.out.printf("The number of pick that yields the sum of %d: %s %s %s %s\n",sum[0],pickedCards[0],pickedCards[1],pickedCards[2],pickedCards[3]);
    }

    private static String pickACard(int[] cards,int[] sum) {
        int pick=(int)(Math.random()*52);
        if(cards[pick]>0){
            sum[0]+=cards[pick];
            if(cards[pick]==1){
                cards[pick]*=-1;
                return "Ace";
            }
            else if(cards[pick]==11){
                cards[pick]*=-1;
                return "Jack";
            }
            else if(cards[pick]==12){
                cards[pick]*=-1;
                return "Queen";
            }
            else if(cards[pick]==13){
                cards[pick]*=-1;
                return "King";
            }
            else {
                cards[pick]*=-1;
                return ""+(cards[pick]*-1);
            }
        }
        else{
            return pickACard(cards,sum);
        }
    }

}
