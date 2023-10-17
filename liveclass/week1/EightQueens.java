package week1;

public class EightQueens {
    private static final int BOARD_SIZE = 8;
    private static int[] queens = new int[BOARD_SIZE];

    public static void main(String[] args) {
        int[] counter=new int[1];

        solveQueensProblem(counter);
    }

    private static void solveQueensProblem(int[] counter) {
        placeQueen(0,counter);
    }

    private static void placeQueen(int row,int[] counter) {
        if (row == BOARD_SIZE) {
            printQueens(counter);
        } else {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (isValidPlacement(row, col)) {
                    queens[row] = col;
                    placeQueen(row + 1,counter);
                }
            }
        }
    }

    private static boolean isValidPlacement(int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = queens[prevRow];

            if (prevCol == col || Math.abs(prevCol - col) == row - prevRow) {
                return false;
            }
        }
        return true;
    }

    private static void printQueens(int[] counter) {

        System.out.println("Solution:");
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.print(queens[row] == col ? "Q " : "- ");
            }
            System.out.println();
        }
        System.out.println();
        counter[0]++;
        System.out.println(counter[0]);
    }


}
