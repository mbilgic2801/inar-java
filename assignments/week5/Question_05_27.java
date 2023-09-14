package week5;

public class Question_05_27 {
    public static void main(String[] args) {
        int j = 0;
        System.out.println("All the leap years from 100 to 2100:");
        for (int i = 100; i <= 2100; i += 4) {

            if (i % 100 == 0 && i % 400 != 0) {
                continue;
            }
            System.out.print(i + " ");
            j++;
            if (j % 10 == 0) {
                System.out.println();
            }
        }
    }
}

