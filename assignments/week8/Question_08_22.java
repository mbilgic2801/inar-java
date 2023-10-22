package week8;

public class Question_08_22 {
    public static void main(String[] args) {
        for (int l = 0; l < 1000; l++) {


            byte[][] matrix = new byte[6][6];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (byte) (Math.random() * 2);
                }
            }
            CommonMethods.printArray(matrix);
            System.out.printf("Every row%s have an even number of 1s\n", checkRowsEven(matrix) ? "************************************" : " does not");
            System.out.printf("Every column%s have an even number of 1s\n", checkColumnsEven(matrix) ? "***************************************" : " does not");
            ;
        }
    }

    private static boolean checkColumnsEven(byte[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int counter=0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[j][i]==1){
                    counter++;
                }
            }
            if(counter%2==1){
                return false;
            }
        }
        return true;
    }

    private static boolean checkRowsEven(byte[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int counter=0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==1){
                    counter++;
                }
            }
            if(counter%2==1){
                return false;
            }
        }
        return true;
    }
}
