package week6;

public class Question_06_10 {
    public static void main(String[] args) {
        int primeCounter = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                primeCounter++;
            }
        }
        System.out.println("The number of prime numbers less than 10,000 is " + primeCounter);

    }

    public static boolean isPrime(int number) {

        for (int j = 2; j < (number / 2 + 1); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}


