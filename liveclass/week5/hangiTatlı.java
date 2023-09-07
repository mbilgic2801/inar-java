package week5;

import java.util.Scanner;

public class hangiTatlı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name="";
        int kekCounter=0;
        int sutlacCounter=0;
        int pudingCounter=0;
        boolean isNotDecided = true;
        while(kekCounter<5&&sutlacCounter<5&&pudingCounter<5){
            System.out.println("İsim gir: ");
            name = input.nextLine();
            int tatlı = (int) (Math.random()*3);
            switch (tatlı){
                case 0:{
                    System.out.println("kek");
                    kekCounter++;
                }break;
                case 1:{
                    System.out.println("sütlaç");
                    sutlacCounter++;
                }break;
                case 2:{
                    System.out.println("puding");
                    pudingCounter++;
                }break;
            }


        }
        if(kekCounter==5)
            System.out.println("kek kazandı");
        else if (sutlacCounter==5) {
            System.out.println("sütlaç kazandı");

        }
        else System.out.println("puding kazandı");
    }
}
