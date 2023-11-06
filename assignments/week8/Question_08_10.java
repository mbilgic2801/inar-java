package week8;

public class Question_08_10 {
    public static void main(String[] args) {
        byte[][] matrix = new byte[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (byte) (Math.random() * 2);
            }
        }
        CommonMethods.printArray(matrix);
        System.out.println("The largest row index: " + largestRow(matrix));
        System.out.println("The largest column index: " + largestColumn(matrix));
    }

    public static int largestColumn(byte[][] matrix) {
        int max = 0;

        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 1) {
                    counter++;
                }
            }
            if (max < counter) {
                index = i;
                max = counter;
            }

        }
        return index;
    }

    private static int largestRow(byte[][] matrix) {
        int max = 0;

        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    counter++;
                }
            }
            if (max < counter) {
                index = i;
                max = counter;
            }

        }
        return index;
    }
}
