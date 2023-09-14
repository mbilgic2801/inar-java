package week5;

public class Question_05_35 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i=1;i<625;i++){
            sum += 1.0 / ( Math.sqrt(i) + Math.sqrt(i+1) );
        }
        System.out.println("The sum of The series is " + sum);
    }
}
