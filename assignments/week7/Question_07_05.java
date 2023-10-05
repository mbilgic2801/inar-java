package week7;


import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers=new int[10];

        for (int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        int[] distinctNumbers=getDistinctNumberArray(numbers);
        System.out.println("The number of distinct numbers is ‚"+getNumberOfDistinctNumber(numbers));
        System.out.print("The distinct numbers are ");
        Question_07_02.printArray(distinctNumbers);

    }
    public static int[] getDistinctNumberArray(int[] numbers){


        String distinct="^";
        int secondCounter=0;
        int[] distinctNumbers=new int[getNumberOfDistinctNumber(numbers)];
        for(int i=0;i<numbers.length;i++){
            if(!distinct.contains("^"+numbers[i]+"^")){
                distinct+=numbers[i]+"^";
                distinctNumbers[secondCounter]=numbers[i];
                secondCounter++;
            }

        }
        return distinctNumbers;
    }
    public static int getNumberOfDistinctNumber(int[] numbers){
        String distinct="^";
        int counter=0;
        for(int i=0;i<numbers.length;i++){
            if(!distinct.contains("^"+numbers[i]+"^")){
                distinct+=numbers[i]+"^";
                counter++;
            }
        }
        return counter;
    }
}
