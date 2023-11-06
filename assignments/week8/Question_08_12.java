package week8;

import android.app.admin.SystemUpdateInfo;
import week6.Question_06_15;

import java.util.Scanner;

public class Question_08_12 {
    //compute tax
    //create arrays for rates and brackets considering status
    //take input status as 0 1 2 3 and the income
    //compute the tax
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), 2-married" +
                "\nseparately, 3- head of household) Enter the filing status: ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        //System.out.println(Question_06_15.computeTax(status,income)); //cross check
        System.out.printf("Tax is %.2f", computeTax(status, income));
    }

    public static double computeTax(int status, double income) {
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16800, 67900, 137050, 208851, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        double tempIncome = income;
        int index = 0;
        for (int i = 0; i < brackets[0].length; i++) {
            if (income > brackets[status][i]) {
                index = i + 1;
            }
        }
        double tax = 0;
        for (int i = index; i >= 0; i--) {
            if (i == index) {
                tax += (tempIncome - brackets[status][i - 1]) * rates[i];
            } else if (i == 0) {
                tax += brackets[status][i] * rates[i];
            } else {
                tax += (brackets[status][i] - brackets[status][i - 1]) * rates[i];
            }
        }
        return tax;
    }
}
