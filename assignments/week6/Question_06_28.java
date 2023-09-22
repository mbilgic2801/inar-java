package week6;

public class Question_06_28 {
    public static void main(String[] args) {
        System.out.println("p                2^p-1  ");
        System.out.println("------------------------");

        printMersennePrimes(10000);
    }

    public static void printMersennePrimes(int number) {
        for (int i = 2; i <= 32; i++) {
            if (Question_06_27.isPrime(i)&&Question_06_26.isPrime((int)Math.pow(2,i)-1)){
                System.out.printf("%-17d%d\n",i,(int)Math.pow(2,i)-1);
            }
        }
    }
}
