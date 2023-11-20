package week10;

public class Question_10_10 {
    public static void main(String[] args) {
        Queue_10_10 a=new Queue_10_10();
        a.enqueue(5);
        a.enqueue(4);
        a.enqueue(33);
        a.enqueue(756);
        a.enqueue(352345);
        System.out.println(a.toString());
        a.dequeue();
        System.out.println(a.toString());
    }
}
