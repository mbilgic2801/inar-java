package week14;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class Question_14_03 {
        public static void main(String[] args) {
            Point[] points = generateRandomPoints(100);

            // Sort by x-coordinates
            Arrays.sort(points);
            System.out.println("Sorted by x-coordinates:");
            displayPoints(points);

            // Sort by y-coordinates
            Arrays.sort(points, new CompareY());
            System.out.println("\nSorted by y-coordinates:");
            displayPoints(points);
        }

        private static Point[] generateRandomPoints(int n) {
            Random random = new Random();
            Point[] points = new Point[n];

            for (int i = 0; i < n; i++) {
                double x = random.nextDouble() * 100; // Adjust the range as needed
                double y = random.nextDouble() * 100;
                points[i] = new Point(x, y);
            }

            return points;
        }

        private static void displayPoints(Point[] points) {
            for (Point point : points) {
                System.out.println("(" + point.getX() + ", " + point.getY() + ")");
            }
        }
    }