package week8;

import java.sql.SQLOutput;

public class Question_08_03 {
    public static void main(String[] args) {
        char[][] grades = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
        };
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
        int[][] scores = new int[8][2];
        for (int i = 0; i < scores.length; i++) {
            int score = 0;
            for (int j = 0; j < grades[0].length; j++) {
                if (grades[i][j] == key[j]) {
                    score++;
                }
            }
            scores[i][0] = i;
            scores[i][1] = score;
        }
        CommonMethods.orderScores(scores);
        printScores(scores);
    }

    public static void printScores(int[][] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %d's correct count is %d\n", scores[i][0], scores[i][1]);
        }
    }

}
