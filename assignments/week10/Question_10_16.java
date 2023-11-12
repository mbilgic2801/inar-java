package week10;


import java.math.BigDecimal;
import java.util.Objects;

public class Question_10_16 {
    public static void main(String[] args) {
        BigDecimal bigDecimal;
        String str = "1";
        for (int i = 0; i < 49; i++) {
            str += 0;
        }
        bigDecimal = new BigDecimal(str);
        int counter = 0;
        while (counter < 10) {
            if (bigDecimal.remainder(new BigDecimal(2)).equals(BigDecimal.ZERO) || bigDecimal.remainder(new BigDecimal(3)).equals(BigDecimal.ZERO)) {
                System.out.println(bigDecimal);
                counter++;
            }
            bigDecimal = bigDecimal.add(BigDecimal.ONE);
        }
    }
}
