package week7;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int balls=input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slots=input.nextInt();
        String[] ballsPath=new String[balls]; //topların yollarını string dizisinde tutuyorum
        int[] ballsInSlots=new int[slots];    //slotlardaki top sayısını int dizisinde tutuyorum
        throwBalls(balls,slots,ballsPath,ballsInSlots);
        printBallsPath(ballsPath);
        //System.out.println(Arrays.toString(ballsPath));
        //System.out.println(Arrays.toString(ballsInSlots));
        drawBeanMachine(ballsInSlots,balls);
    }
    private static void printBallsPath(String[] ballsPath) {
        for (int i = 0; i < ballsPath.length; i++) {
            System.out.println(ballsPath[i]);
        }
    }
    public static void throwBalls(int balls, int slots, String[] ballsWay,int[] ballsInSlots) {
        for(int i=0;i<balls;i++){
            String way="";
            int whichSlot=0;
            for (int j = 0; j < slots-1; j++) {
                if(Math.random()<0.5){
                    way+="L";
                }
                else {
                    way+="R";
                    whichSlot++;
                }
            }
            ballsWay[i]=way;
            ballsInSlots[whichSlot]++;
        }
    }
    public static void drawBeanMachine(int[] slot,int balls) {
        String[] beanMachine=new String[balls];
        for(int i=0;i< balls;i++){
            beanMachine[i]="";
        }
        for(int i=0;i<balls;i++){
            for (int j = 0; j < slot.length; j++) {
                if(slot[j]>0){
                    beanMachine[i]+="0";
                    slot[j]-=1;
                }
                else {
                    beanMachine[i]+=" ";
                }
            }
        }
        for (int i = balls-1; i >=0 ; i--) {
            if(beanMachine[i].contains("0")){
            System.out.println(beanMachine[i]);
        }
        }
    }
}
