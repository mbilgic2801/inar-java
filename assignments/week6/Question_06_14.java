package week6;

public class Question_06_14 {
    public static void main(String[] args) {
        System.out.println("i         m(i)     ");
        System.out.println("-------------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-6d%10.4f\n", i, estimatePi(i));
        }
    }

    public static double estimatePi(int number) {
        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += 4*(Math.pow(-1, i + 1)) / (2 * i - 1);
        }
        return sum;
    }
}
