package week14;
import java.util.*;
class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.getY() != p2.getY()) {
            return Double.compare(p1.getY(), p2.getY());
        } else {
            return Double.compare(p1.getX(), p2.getX());
        }
    }
}
