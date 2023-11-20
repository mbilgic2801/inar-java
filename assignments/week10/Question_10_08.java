package week10;

public class Question_10_08 {
    public static void main(String[] args) {
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208851, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        System.out.println("                       2009 Taxes");
        System.out.println("Income     Status 0    Status 1    Status 2    Status 3");
        System.out.println("-------------------------------------------------------------");
        for (int i = 50000; i <60001 ; i+=1000) {
            System.out.print(i+"     ");
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-12s",new Tax_10_08(j,brackets,rates,i).toString());
            }
            System.out.println();
        }

    }
}
