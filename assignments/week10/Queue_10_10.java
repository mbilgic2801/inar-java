package week10;

import org.jetbrains.annotations.NotNull;

public class Queue_10_10 {
    private int[] elements;
    private int size;
    //public static final int DEFAULT_CAPACITY = 1;

    public Queue_10_10() {
        this.elements=new int[8];
    }

    public void enqueue(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++]=value;
    }
    public int dequeue(){
        int[] temp=new int[size-1];
        int tempNumber=elements[0];
        for (int i = 0; i < size-1; i++) {
            temp[i]=elements[i+1];
        }
        elements=temp;
        size--;
        return tempNumber;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }

    @NotNull
    @Override
    public String toString() {
        String str="";
        for (int i = 0; i < size; i++) {
            str+=" "+elements[i];
        }
        return str;
    }
}
