package week5;

public class Question_05_25 {
    public static void main(String[] args) {

        for (int j = 10000; j <= 100000; j += 10000) {
            double sumOfSeries = 0;
            for (int i = 1; i < j; i++) {
                sumOfSeries = sumOfSeries + 4 * (Math.pow(-1, i + 1)) / (2 * i - 1);
            }
            System.out.println("PI value for i="+j+":"+sumOfSeries);
        }
    }
}
