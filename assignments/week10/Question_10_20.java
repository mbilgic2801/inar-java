package week10;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.math.RoundingMode;

public class Question_10_20 {
    public static void main(String[] args) {
        for (int i = 100; i < 1001; i+=100) {
            System.out.println(getE(i));
        }
        System.out.println(Math.E);


    }
    public static BigDecimal getE(int k){
        BigDecimal a;
        BigDecimal sum=new BigDecimal(0);
        for (int i = 0; i <k ; i++) {
            BigInteger factorial=new BigInteger(""+(i+1));
            a=new BigDecimal(fac(factorial));
            BigDecimal aa=new BigDecimal(1);

            BigDecimal aaa=aa.divide(a,25, RoundingMode.HALF_EVEN);
            sum=sum.add(aaa);

        }
        return sum;
    }
    public static BigInteger fac(BigInteger fakt){
        BigInteger a=new BigInteger("1");
        BigInteger b=new BigInteger("1");
        while (b.compareTo(fakt)<0){
            a=a.multiply(b);
            b=b.add(new BigInteger("1"));

        }

        return a;
    }
}
