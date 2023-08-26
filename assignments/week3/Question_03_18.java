package week3;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weightOfPackage;
        System.out.print("Enter the weight of package (in pounds) : ");
        weightOfPackage = input.nextDouble();

        if(weightOfPackage>20){
            System.out.println("The package cannot be shipped.");
        }
        else if ( weightOfPackage > 10 && weightOfPackage <= 20 ){
            System.out.println("Shipping cost of package is $" + ( 10.5 * weightOfPackage ) );
        }
        else if ( weightOfPackage > 3 && weightOfPackage <= 10){
            System.out.println("Shipping cost of package is $" + ( 8.5 * weightOfPackage ) );
        }
        else if ( weightOfPackage > 1 && weightOfPackage <= 3){
            System.out.println("Shipping cost of package is $"+ ( 5.5 * weightOfPackage ) );
        }
        else{
            System.out.println("Shipping cost of package is $"+ ( 3.5 * weightOfPackage ) );
        }
    }
}
