package week7;

public class Question_07_06 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int counter = 2;
        int numberOfPrimes = 0;
        while (numberOfPrimes < 50) {
            boolean isPrime = true;
            for (int j = (int) Math.sqrt(counter); j >= 2; j--) {
                if (counter % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeNumbers[numberOfPrimes] = counter;
                numberOfPrimes++;
            }
            counter++;
        }


        printArray(primeNumbers, 10);
    }

    public static void printArray(int[] array, int perLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d ", array[i]);
            if ((i + 1) % perLine == 0) {
                System.out.println("");
            }
        }
    }
}
