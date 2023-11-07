package week9;

public class Fan_09_08 {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    boolean on = false;
    double radius = 5;
    String color="blue";
    Fan_09_08(){

    }
    public String toString(){
        return on?"Fan speed: "+speed+", color: "+color+" , radius: "+radius
                 :"Fan color: "+color+", radius: "+radius+"\nFan is off";
    }
    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
