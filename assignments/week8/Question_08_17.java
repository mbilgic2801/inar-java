package week8;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_17 {
    /*
    25 2 1 100,5 4 320,5
    125 2 2 40 3 85
    175 2 3 75 0 125
    75 1 0 125
    181 1 2 125
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of banks :");
        int n = input.nextInt();//number of banks
        System.out.println("Enter minimum total assets for keeping a bank safe :");
        double minimumAssets = input.nextDouble();
        double[] currentBalances = new double[n];
        double[][] borrowers = new double[n][n];
        boolean[] isSafe = new boolean[n];
        for (int i = 0; i < n; i++) {
            getInfoAboutBank(currentBalances, borrowers, i);
            isSafe[i] = true;
        }
        startTsunami(currentBalances, borrowers, minimumAssets, isSafe);
    }

    public static void startTsunami(double[] currentBalances, double[][] borrowers, double minimumAssets, boolean[] isSafe) {
        int n = currentBalances.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                currentBalances[i] += borrowers[i][j];
            }
        }
        checkBalances(currentBalances, borrowers, minimumAssets, isSafe);
    }

    public static void checkBalances(double[] currentBalances, double[][] borrowers, double minimumAssets, boolean[] isSafe) {
        int n = currentBalances.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (currentBalances[j] < minimumAssets) {
                    isSafe[j] = false;
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (!isSafe[j]) {
                        currentBalances[k] -= borrowers[k][j];
                        borrowers[k][j] = 0;
                    }
                }

            }
        }
        System.out.println();
        printUnsafeBanks(currentBalances, minimumAssets);
    }

    public static void printUnsafeBanks(double[] currentBalances, double minimumAssets) {
        System.out.println("The unsafe banks are");
        for (int i = 0; i < currentBalances.length; i++) {
            if (currentBalances[i] < minimumAssets) {
                System.out.print(i + "  ");
            }
        }
    }

    public static void getInfoAboutBank(double[] balance, double[][] borrowers, int i) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter bank %d 's total assets Enter the number of banks that borrowed money\nfrom bank %d Enter borrowers ID amount borrowed :", i, i);
        balance[i] = input.nextDouble();
        int n = input.nextInt();//number of banks that this bank lend
        for (int j = 0; j < n; j++) {
            int index = input.nextInt();
            borrowers[i][index] = input.nextDouble();
        }
    }
}
