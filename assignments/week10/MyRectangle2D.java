package week10;

public class MyRectangle2D {
    double x;
    double y;
    double height;
    double width;

    public MyRectangle2D() {
        x = 0;
        y = 0;
        height = 1;
        width = 1;
    }

    public MyRectangle2D(double x, double y, double height, double width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    public boolean contains(double x, double y) {
        return Math.abs(this.x - x) < width / 2 && Math.abs(this.y - y) < height / 2;
    }

    public boolean contains(MyRectangle2D r) {
        return contains(r.x-r.width/2,r.y-r.height/2)&&contains(r.x+r.width/2,r.y-r.height/2)
                &&contains(r.x+r.width/2,r.y+r.height/2)&&contains(r.x-r.width/2,r.y+r.height/2);
    }
    public boolean overlaps(MyRectangle2D r){
        return true;//to be continued
    }
}
