package week6;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println(" SalesAmount     Commission   ");
        System.out.println("------------------------------");
        for (int i=10000;i<=100000;i+=5000){
            System.out.printf(" %-6d%18.1f \n",i,computeCommission(i));
        }

    }

    public static double computeCommission(double salesAmount) {
        double commission = 0;
        if (salesAmount > 10000) {
            commission += (salesAmount - 10000) * 0.12;
            salesAmount = 10000;
        }
        if (salesAmount > 5000) {
            commission += (salesAmount - 5000) * 0.1;
            salesAmount = 5000;
        }
        if (salesAmount <= 5000) {
            commission += salesAmount * 0.08;
        }
        return commission;


    }
}
