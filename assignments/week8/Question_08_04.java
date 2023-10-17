package week8;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        int employeeNumber = input.nextInt();
        int[][] workingHours = new int[employeeNumber][7];
        System.out.println("Enter the working hours of employees:");
        CommonMethods.takeInput(workingHours);
        int[][] totalHoursOfEmployees = getTotalHours(workingHours);
        CommonMethods.orderScores(totalHoursOfEmployees);//scores veya hours sıralama
        printHours(totalHoursOfEmployees);
    }

    public static int[][] getTotalHours(int[][] workingHours) {
        int[][] totalHoursOfEmployees = new int[workingHours.length][2];
        for (int i = 0; i < workingHours.length; i++) {
            int sum = 0;
            for (int j = 0; j < workingHours[0].length; j++) {
                sum += workingHours[i][j];
            }
            totalHoursOfEmployees[i][0] = i;
            totalHoursOfEmployees[i][1] = sum;
        }
        return totalHoursOfEmployees;
    }

    public static void printHours(int[][] hours) {
        for (int i = hours.length - 1; i >= 0; i--) {
            System.out.printf("Employee %d's total work hour is %d\n", hours[i][0], hours[i][1]);
        }
    }
}
