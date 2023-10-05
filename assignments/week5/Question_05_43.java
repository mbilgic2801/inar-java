package week5;

public class Question_05_43 {
    public static void main(String[] args) {
        int counter = 0;
        for (int j = 1; j < 7; j++) {
            for (int i = j; i < 7; i++) {
                System.out.println(j + " " + (i + 1));
                counter++;
            }
        }
        System.out.println("The total number of all combinations is " + counter);
    }
}
