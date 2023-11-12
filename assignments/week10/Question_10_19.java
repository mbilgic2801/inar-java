package week10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Question_10_19 {
    public static void main(String[] args) {
        BigInteger base=new BigInteger("2");
        System.out.println("p      2^p - 1");
        for (int i = 2; i < 100; i++) {
            BigInteger number=(base.pow(i)).subtract(new BigInteger("1"));
            //System.out.print(i+"------------"+       number+"-----------");
            if(isPrime(number)) {
                System.out.printf("%-7d  %-7d\n", i, number);
            }

        }
    }
    public static boolean isPrime(BigInteger a){
        BigInteger temp=new BigInteger("2");


        while (temp.compareTo(a.divide(new BigInteger("2")))<0){
            if(a.remainder(temp).equals(BigInteger.ZERO)){
                return false;
            }
            temp=temp.add(BigInteger.ONE);
        }
        return true;
    }
}
