package week9;

public class Question_09_08 {
    public static void main(String[] args) {
        Fan_09_08 a=new Fan_09_08();
        a.setSpeed(3);
        a.setRadius(10);
        a.setColor("yellow");
        a.setOn(true);
        Fan_09_08 b=new Fan_09_08();
        b.setOn(false);
        b.setColor("blue");
        b.setRadius(5);
        b.setSpeed(2);
        System.out.println(a.toString());
        System.out.println("-------------------");
        System.out.println(b.toString());
    }
}
