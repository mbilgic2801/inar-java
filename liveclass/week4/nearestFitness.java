package week4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class nearestFitness {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Gym centers' positions: ");
        int tempGym1 = input.nextInt();
        int tempGym2 = input.nextInt();
        int tempGym3 = input.nextInt();
        int firstGymPosition = Math.abs(tempGym1);
        int secondGymPosition = Math.abs(tempGym2);
        int thirdGymPosition = Math.abs(tempGym3);
        System.out.println(Math.min(Math.min(firstGymPosition,secondGymPosition),thirdGymPosition));
        String name = "Mehmet";


    }
}
