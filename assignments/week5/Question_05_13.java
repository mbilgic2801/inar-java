package week5;

public class Question_05_13 {
    public static void main(String[] args) {
        int n=0;

        while(n*n*n<12000){
            n++;
        }
        System.out.println("The largest n is "+(n-1));
    }
}
