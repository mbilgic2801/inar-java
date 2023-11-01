package week8;

import java.util.Scanner;

public class Question_08_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of banks :");
        int n = input.nextInt();//number of banks
        System.out.println("Enter minimum total assets for keeping a bank safe :");
        double minimumAssets = input.nextDouble();
        double[] currentBalances = new double[n];
        double[][] borrowers = new double[n][n];
        for (int i = 0; i < n; i++) {
            getInfoAboutBank(currentBalances, borrowers, i);
        }
        startTsunami(currentBalances, borrowers, minimumAssets);
    }

    public static void startTsunami(double[] currentBalances, double[][] borrowers, double minimumAssets) {
        int n = currentBalances.length;
        CommonMethods.printArray(currentBalances);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                currentBalances[i] += borrowers[i][j];
                currentBalances[j] -= borrowers[i][j];
            }
        }
        CommonMethods.printArray(currentBalances);
    }

    public static void getInfoAboutBank(double[] balance, double[][] borrowers, int i) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter bank %d 's total assets Enter the number of banks that borrowed money\nfrom bank %d Enter borrowers ID amount borrowed :",i,i);
        balance[i] = input.nextDouble();
        int n = input.nextInt();//number of banks that this bank lend
        for (int j = 0; j < n; j++) {
            int index = input.nextInt();
            borrowers[i][index] = input.nextDouble();
        }
    }
}
