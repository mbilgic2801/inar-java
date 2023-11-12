package week5;

public class Question_05_26 {
    public static void main(String[] args) {


            double sumOfseries=0;
            for (int i = 0; i <= 100000; i++) {
                double divisor = 1;
                for (int j = i; j >= 0; j--) {
                    if (j == 0) {
                        divisor *= 1;
                    } else {
                        divisor *= j;
                    }
                }
                sumOfseries += 1.0 / divisor;
                if(i%10000==0&&i!=0) {
                    System.out.println("e at i=" + i + " is " + sumOfseries);
                }
            }
        System.out.println("Java's e is      "+Math.E);
    }
}
