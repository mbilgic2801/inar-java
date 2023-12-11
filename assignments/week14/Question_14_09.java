package week14;

public class Question_14_09 {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.push(62);
        myQueue.push(66);
        myQueue.push(70);
        System.out.println(myQueue.toString());
        System.out.println("is empty? "+myQueue.empty());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.toString());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.toString());
        System.out.println(myQueue.peek());



    }
}
