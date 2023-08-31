package week4;

import java.util.Scanner;

public class Question_04_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        double hoursOfWorked;
        double hourlyPayRate;
        double federalTaxRate;
        double stateTaxRate;
        double grossPay;
        double netPay;

        System.out.print("Enter employee's name: ");
        name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        hoursOfWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        hourlyPayRate = input.nextDouble();
        grossPay = hourlyPayRate * hoursOfWorked;
        System.out.print("Enter federal tax withholding rate: ");
        federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        stateTaxRate = input.nextDouble();
        double federalTax = grossPay * federalTaxRate;
        double stateTax = grossPay * stateTaxRate;
        double totalDeduction = federalTax + stateTax;

        netPay = grossPay - totalDeduction;

        System.out.printf("Employee Name: %s",name);
        System.out.printf("\nHours Worked: %.2f",hoursOfWorked);
        System.out.printf("\nPay Rate: %.2f",hourlyPayRate);
        System.out.printf("\nGross Pay: %.2f",grossPay);
        System.out.printf("\nDeductions:" +
                          "\n\tFederal Withholding (%.1f%%): $%.2f" +
                          "\n\tState Withholding (%.1f%%): $%.2f" +
                          "\n\tTotal Deduction: $%.2f",
                            federalTaxRate*100,federalTax,stateTaxRate*100,stateTax,totalDeduction);

        System.out.printf("\nNet Pay: %.2f",netPay);



    }
}
