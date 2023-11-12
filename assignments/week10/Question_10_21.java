package week10;

import java.math.BigInteger;

public class Question_10_21 {
    public static void main(String[] args) {
        System.out.println("First ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6:");
        int counter=0;
        BigInteger number=new BigInteger(""+Long.MAX_VALUE).add(new BigInteger("1"));
        //System.out.println(number);
        while (counter<10){
            boolean a=number.remainder(new BigInteger("5")).equals(new BigInteger("0"));
            boolean b=number.remainder(new BigInteger("6")).equals(new BigInteger("0"));
            if(a||b){
                System.out.println(number);
                counter++;
            }
            number=number.add(new BigInteger("1"));
        }
    }
}
