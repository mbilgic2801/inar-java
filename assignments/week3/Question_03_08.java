package week3;


import java.util.Scanner;

public class Question_03_08 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int tempFirst;
        int tempSecond;
        int tempThird;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 integers : ");
        tempFirst = input.nextInt();
        tempSecond = input.nextInt();
        tempThird = input.nextInt();
if( tempFirst > tempSecond && tempFirst > tempThird ) {
    firstNumber = tempFirst;
    if ( tempSecond > tempThird ) {
        secondNumber = tempSecond;
        thirdNumber = tempThird;
    }
    else {
        secondNumber = tempThird;
        thirdNumber = tempSecond;
    }
}
else if( tempFirst < tempSecond && tempFirst < tempThird ) {
    thirdNumber = tempFirst;
    if ( tempSecond > tempThird ) {
        firstNumber = tempSecond;
        secondNumber = tempThird;
    }
    else {
        firstNumber = tempThird;
        secondNumber = tempSecond;
    }
}
else {
    secondNumber=tempFirst;
    if ( tempSecond > tempThird ) {
        firstNumber = tempSecond;
        thirdNumber = tempThird;
    }
    else {
        firstNumber = tempThird;
        thirdNumber = tempSecond;
    }

}
        System.out.println( thirdNumber + " < "+ secondNumber +" < " + firstNumber);

    }
}
