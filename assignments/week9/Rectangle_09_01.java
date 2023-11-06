package week9;

public class Rectangle_09_01 {
    double width;
    double height;
    Rectangle_09_01(){

    }
    Rectangle_09_01(double width, double height){
        this.width=width;
        this.height=height;
    }
    double getArea(){
        return height*width;
    }
    double getPerimeter(){
        return 2*(height+width);
    }
}
