package week5;

public class Question_05_23 {
    public static void main(String[] args) {
        double sumLeftToRight = 0;
        double sumRightToLeft = 0;
        for(int i=1,j=50000;i<=50000;i++,j--){
            sumLeftToRight = sumLeftToRight + 1.0/i;
            sumRightToLeft = sumRightToLeft + 1.0/j;
        }
        System.out.println("Summation of series left to right: " + sumLeftToRight);
        System.out.println("Summation of series right to left: " + sumRightToLeft);
        System.out.println("Summation of series right to left - Summation of series left to\nright: "+(sumRightToLeft-sumLeftToRight));

    }
}
