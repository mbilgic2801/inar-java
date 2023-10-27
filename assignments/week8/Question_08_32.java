package week8;

public class Question_08_32 {
    public static void main(String[] args) {
        double[][] matrix=new double[3][2];
        System.out.print("Enter x1,y1,x2,y2,x3,y3:");
        CommonMethods.takeInput(matrix);
        System.out.printf(getTriangleArea(matrix)==0?
                        "The three points are on the same line":
                        "The area of the triangle is %.2f",getTriangleArea(matrix));
    }

    private static double getTriangleArea(double[][] matrix) {


        double side1=Math.pow((Math.pow((matrix[0][0]-matrix[1][0]),2)+Math.pow((matrix[0][1]-matrix[1][1]),2)),0.5);
        double side2=Math.pow((Math.pow((matrix[1][0]-matrix[2][0]),2)+Math.pow((matrix[1][1]-matrix[2][1]),2)),0.5);
        double side3=Math.pow((Math.pow((matrix[2][0]-matrix[0][0]),2)+Math.pow((matrix[2][1]-matrix[0][1]),2)),0.5);
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}
