package week9;

public class Question_09_09 {
    public static void main(String[] args) {
        RegularPolygon_09_09[] polygon=new RegularPolygon_09_09[3];
        polygon[0] =new RegularPolygon_09_09();
        polygon[1]=new RegularPolygon_09_09(6,4);
        polygon[2]=new RegularPolygon_09_09(10,4,5.6,7.8);
        System.out.printf("First RegularPolygon perimeter is : %.1f   area is  :  %.17f\n",polygon[0].getPerimeter(),polygon[0].getArea());
        System.out.printf("Second RegularPolygon perimeter is : %.1f   area is  :  %.15f\n",polygon[1].getPerimeter(),polygon[1].getArea());
        System.out.printf("Third RegularPolygon perimeter is : %.1f   area is  :  %.14f\n",polygon[2].getPerimeter(),polygon[2].getArea());
    }
}
