package week3;

public class Question_03_16 {
    public static void main(String[] args) {
        int xOfCoordinate = (int) ( Math.random() * 51 ) * ( ( Math.random() > 0.5 ) ? -1 : 1 );
        int yOfCoordinate = (int) ( Math.random() * 101 ) * ( ( Math.random() > 0.5 ) ? -1 : 1 );;
        System.out.println("Random coordinate in rectangle centered at (0,0) with width 100 and height " +
                "\n200: (" + xOfCoordinate + "," + yOfCoordinate + ")");
    }
}
