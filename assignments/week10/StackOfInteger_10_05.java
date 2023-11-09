package week10;

public class StackOfInteger_10_05 {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    StackOfInteger_10_05() {
        this(DEFAULT_CAPACITY);
    }

    StackOfInteger_10_05(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++]=value;
    }
    public int pop(){
        return elements[--size];
    }
    public int peek(){
        return elements[size-1];
    }
    public boolean empty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }
}
