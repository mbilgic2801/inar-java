package week9;

public class Question_09_01 {
    public static void main(String[] args) {

        Rectangle_09_01[] rectangles=new Rectangle_09_01[2];
        rectangles[0]=new Rectangle_09_01(4,40);
        rectangles[1]=new Rectangle_09_01(3.5,35.9);
        for (int i = 0; i < rectangles.length; i++) {
            System.out.printf("--Rectangle %d--\n",i+1);
            System.out.printf("Width    : %.1f\n",rectangles[i].width);
            System.out.printf("Height   : %.1f\n",rectangles[i].height);
            System.out.printf("Area     : %.1f\n",rectangles[i].getArea());
            System.out.printf("Perimeter: %.1f\n",rectangles[i].getPerimeter());
            System.out.println();
        }
    }
}
