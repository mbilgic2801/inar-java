package week3;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {
        while(true) {
            int guessDigit1, guessDigit2, guessDigit3, lotteryDigit1, lotteryDigit2, lotteryDigit3;
            int lotteryGuess;
            int lotteryNumber = 123;
            int firstDigitCounter=0;
            int secondDigitCounter=0;
            int thirdDigitCounter=0;
            lotteryDigit1 = lotteryNumber / 100;
            lotteryDigit2 = (lotteryNumber / 10) % 10;
            lotteryDigit3 = lotteryNumber % 10;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your lottery pick (three digits): ");
            lotteryGuess = input.nextInt();
            guessDigit1 = lotteryGuess / 100;
            guessDigit2 = (lotteryGuess / 10) % 10;
            guessDigit3 = lotteryGuess % 10;
            boolean matched1To1 = guessDigit1==lotteryDigit1;
            boolean matched1To2 = guessDigit1==lotteryDigit2;
            boolean matched1To3 = guessDigit1==lotteryDigit3;
            boolean matched2To1 = guessDigit2==lotteryDigit1;
            boolean matched2To2 = guessDigit2==lotteryDigit2;
            boolean matched2To3 = guessDigit2==lotteryDigit3;
            boolean matched3To1 = guessDigit3==lotteryDigit1;
            boolean matched3To2 = guessDigit3==lotteryDigit2;
            boolean matched3To3 = guessDigit3==lotteryDigit3;
            if(lotteryGuess==lotteryNumber)
                System.out.println("100000dollars");
            else{

                if(matched1To1&&(!matched2To1)&&(!matched3To1))
                    firstDigitCounter +=1;
                else if(matched2To1&&(!matched3To1))
                    firstDigitCounter +=1;

                if(matched1To2&&(!matched2To2)&&(!matched3To2))
                    secondDigitCounter +=1;
                else if(matched2To2&&(!matched3To2))
                    secondDigitCounter +=1;

                if(matched1To3&&(!matched2To3)&&(!matched3To3))
                    thirdDigitCounter +=1;
                else if(matched2To1&&(!matched3To1))
                    thirdDigitCounter +=1;


                }

            }

            }
        }



