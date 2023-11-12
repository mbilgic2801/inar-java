package week10;

import java.math.BigDecimal;
import java.math.MathContext;

public class Question_10_17 {
    public static void main(String[] args) {
        MathContext mc=new MathContext(10);
        BigDecimal a=new BigDecimal(Long.MAX_VALUE);
        BigDecimal root=a.sqrt(mc);
        BigDecimal result=root.multiply(root);

        System.out.println(result);
        System.out.println(root);
        System.out.println("-----"+Long.MAX_VALUE);
        for (int i = 0; i < 10; i++) {
            BigDecimal number=root.add(new BigDecimal(i));
            number=number.multiply(number);
            System.out.println("-----"+number);

        }
    }
}
