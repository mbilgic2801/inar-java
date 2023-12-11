package week14;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int x){
        stack1.push(x);
    }
    public int pop(){
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int poppedItem=stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return poppedItem;
    }
    public int peek(){
        return stack1.get(0);
    }
    public boolean empty(){
        return stack1.isEmpty();
    }
    public String toString(){
        return stack1.toString();
    }
}
