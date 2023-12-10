package week14;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int topElement;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int number) {
        while (!empty()) {
            queue2.add(queue1.poll());
        }
        queue1.add(number);
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
        topElement = number;
    }

    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedElement = queue1.poll();
        if (!queue1.isEmpty()) {
            topElement = queue1.peek();
        }
        return poppedElement;
    }

    public int top() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return topElement;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
