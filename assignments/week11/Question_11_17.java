package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int number=input.nextInt();
        int temp=number;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = number/2; i > 1; i--) {
            while (isPrime(i)&&temp%i==0){
                list.add(i);
                temp/=i;
                //System.out.print(i+" ");
            }
        }
        System.out.printf("The smallest number n for m * n to be a perfect square is %d\n" +
                "m * n is %d",squareMakerInteger(list),number*squareMakerInteger(list));
    }
    public static boolean isPrime(int value){
        for (int j = 2; j < (value / 2 + 1); j++) {
            if (value % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static int squareMakerInteger(ArrayList<Integer> list){
        ArrayList<Integer> temp=list;
        temp.add(0);
        int sum=1;
        int counter=1;
        for (int i = 0; i < temp.size()-1; i++) {

            if(temp.get(i)== temp.get(i+1)){
                counter++;
            }
            else{
                if(counter%2!=0){
                    sum*= temp.get(i);
                }
                counter=1;
            }
        }
        return sum;
    }
}
