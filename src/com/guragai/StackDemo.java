package com.guragai;

import java.util.Arrays;

class Stack<E> {
    private E[] elements;
    private int currentSize;
    private static final int INITIAL_SIZE = 10;

    public Stack() {
        elements = (E[]) new Object[INITIAL_SIZE];
    }

    public void push(E value) {
        if (currentSize >= elements.length) {
            elements = Arrays.copyOf(elements, 2 * elements.length);
        }
        elements[currentSize] = value;
        currentSize++;
    }

    public E pop() {
        currentSize--;
        return (E) elements[currentSize];
    }

    public int size(){return currentSize;}
}
public class StackDemo{
    public static void main(String[] args) {
        Stack<Integer> countdown = new Stack<Integer>();
        for(int i = 0; i <= 10; i++){
            countdown.push(i);
        }

        while (countdown.size() > 0){
            System.out.println(countdown.pop());
        }
    }
}
