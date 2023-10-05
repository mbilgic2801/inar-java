package week7;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int[] array=new int[5];

    for (int i=0;i<5;i++){
        array[i]=input.nextInt();
    }
        System.out.println("The greatest common divisor is "+gcd(array));
    }
    public static int gcd(int... numbers){

        for(int i=min(numbers);i>0;i--){
            int counter=0;
            for (int number : numbers) {
                if (number % i == 0) {
                    counter++;
                }
                if (counter == numbers.length) {
                    return i;
                }
            }
        }
        return 0;

    }
    public static int min(int[] array){
        int min=array[0];
        for (int i=1;i<array.length;i++){
            min=Math.min(min,array[i]);
        }
        return min;
    }

}
