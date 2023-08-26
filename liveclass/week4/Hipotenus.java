package week4;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(c);

    }
}
