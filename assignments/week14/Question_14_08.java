package week14;

public class Question_14_08 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.queue1.add(44);
        myStack.push(55);
        System.out.println(myStack.queue1.toString());
        System.out.println(myStack.empty());
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.queue1.toString());

    }
}
