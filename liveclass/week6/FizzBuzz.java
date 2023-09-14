package week6;

public class FizzBuzz {
    public static void main(String[] args) {
        // if %3==0 Fizz
        // if %5==0 Buzz
        // if %3==0&&%5==0 FizzBuzz
        // if %3!=0&&%5!=0 number itself
        // 0 between 100
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }
}
