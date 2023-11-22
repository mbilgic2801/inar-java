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
    public static MyRectangle2D getRectangle(double[][] points){
        double tempXmin=points[0][0];
        double tempYmin=points[0][1];
        double tempXmax=points[0][0];
        double tempYmax=points[0][1];
        for (int i = 1; i < points.length; i++) {
            if(tempXmin>points[i][0]){
                tempXmin=points[i][0];
            }
            if(tempXmax<points[i][0]){
                tempXmax=points[i][0];
            }
            if(tempYmin>points[i][1]){
                tempYmin=points[i][1];
            }
            if(tempYmax<points[i][1]){
                tempYmax=points[i][1];
            }
        }
        return new MyRectangle2D((tempXmax+tempXmin)/2,(tempYmin+tempYmax)/2,(tempXmax-tempXmin),(tempYmax-tempYmin));
    }
}
