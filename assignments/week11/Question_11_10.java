package week11;

import java.util.Objects;
import java.util.Scanner;

public class Question_11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack myStack = new MyStack();
        MyStack myStack1 = new MyStack();
        System.out.print("Enter five object: ");
        for (int i = 0; i < 5; i++) {
            Object a = input.next();
            myStack.push(a);
        }

        System.out.println(myStack.toString());
        System.out.println("Displaying them in reverse order..");
        while (true) {
            myStack1.push(myStack.pop());
            if (myStack.getSize() == 0) {
                break;
            }
        }

        myStack = myStack1;
        System.out.println(myStack.toString());


    }

}
