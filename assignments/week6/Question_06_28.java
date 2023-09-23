package week6;

public class Question_06_28 {
    public static void main(String[] args) {
        System.out.println("p                2^p-1  ");
        System.out.println("------------------------");

        printMersennePrimes(10000);
    }

    public static void printMersennePrimes(long number) {
        for (int i = 2; i <= 32; i++) {
            if (isPrime(i)&&isPrime((long)Math.pow(2,i)-1)){
                System.out.printf("%-17d%d\n",i,(long)Math.pow(2,i)-1);
            }
        }
    }
    public static boolean isPrime(long number){
        for (long j = 2; j < (number / 2 + 1); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
