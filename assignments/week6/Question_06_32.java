package week6;

import java.util.Scanner;

public class Question_06_32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How many rounds will you play craps: ");
        int times=input.nextInt();

        System.out.println("Number of winning games:  "+craps(times));
    }
    public static int craps(int times){
        int counter=0;
        for(int i=0;i<times;i++){
        int tempSum=0;
        int firstDice=rollDice();
        int secondDice=rollDice();
        int sum=firstDice+secondDice;
        if(sum==2||sum==3||sum==12){
            System.out.printf("you rolled %d + %d = %d\n",firstDice,secondDice,sum);
            System.out.println("you lose");

        }
        else if (sum==7||sum==11) {
            System.out.printf("you rolled %d + %d = %d\n",firstDice,secondDice,sum);
            System.out.println("you win");
            counter++;

        }
        else {
            System.out.printf("you rolled %d + %d = %d\n", firstDice, secondDice, sum);
            System.out.printf("point is %d\n", sum);
            tempSum = sum;
            while (true) {
                firstDice = rollDice();
                secondDice = rollDice();
                sum = firstDice + secondDice;
                if (sum == tempSum) {
                    System.out.printf("you rolled %d + %d = %d\n", firstDice, secondDice, sum);
                    System.out.println("you win");
                    counter++;
                    break;
                }
                else if (sum == 7) {
                    System.out.printf("you rolled %d + %d = %d\n", firstDice, secondDice, sum);
                    System.out.println("you lose");
                    break;
                }
                else {
                    System.out.printf("you rolled %d + %d = %d\n", firstDice, secondDice, sum);
                    System.out.println("Roll dice again");
                }
            }
        }
        }
        return counter;
    }
    public static int rollDice(){
        return (int)(Math.random()*6+1);
    }
}
