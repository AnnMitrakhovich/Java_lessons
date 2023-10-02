
//Реализовать стэк с помощью массива. Нужно реализовать методы:
//        size(), empty(), push(), peek(), pop().
//

import java.util.ArrayList;
import java.util.Stack;

public class GBStack {
    private int[] arr; // отложенная инициализация
    private int top;
    private int capacity;

    public GBStack() {
        int size = 3;
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    private void addCapacity() {
        int[] copy = new int[arr.length + arr.length / 2];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        arr = copy;
        capacity = arr.length;
    }

    public int size() {
        return top + 1;
    }

    public boolean empty() {
        return top == -1;
    }

    public GBStack push(int d) {
        if (isFull()) {
            addCapacity();
        }
        arr[++top] = d;
        return this;
    }

    public int peek() {
        if (!empty()) {
            return arr[top];
        } else {
            throw new RuntimeException("Stack is Empty");
        }
    }

    private boolean isFull() {
        return capacity == size();
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is Empty");
        }
        peek();
        return arr[top--];
    }

    @Override
    public String toString() {
        ArrayList<Integer> elements = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            elements.add(arr[i]);

        }
        return elements.toString();
    }
}

