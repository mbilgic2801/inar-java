package week10;

import java.math.BigDecimal;

public class Question_10_18 {
    public static void main(String[] args) {
        BigDecimal a=new BigDecimal(Long.MAX_VALUE);
        int counter=0;
        while(counter<5) {
            if (isPrime(a)) {
                System.out.println(a);
                counter++;
                a=a.add(BigDecimal.ONE);
            }
        }
    }
    public static boolean isPrime(BigDecimal a){
        BigDecimal temp=new BigDecimal(2);

        while (temp.compareTo(a)<0){
            if(a.remainder(temp).equals(BigDecimal.ZERO)){
                return false;
            }
            temp=temp.add(BigDecimal.ONE);
        }
        return true;
    }
}
