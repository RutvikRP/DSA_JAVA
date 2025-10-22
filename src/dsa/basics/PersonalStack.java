package dsa.basics;


public class PersonalStack {
    public static void main(String[] args) {
        OStack stack = new OStack(5);
        stack.pop();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(10);
        stack.display();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
    }
}

class OStack {
    private int capacity;
    private int top;
    private int[] arr;

    public OStack(int size) {
        this.capacity = size;
        arr = new int[size];
        top = -1;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");

            return;
        }
        System.out.println(arr[top]);
    }

    public void push(int ele) {
        if (isFull()) {
            System.out.println("Stack is full.");
            System.out.println("*********");
            display();
            System.out.println("*********");
            return;
        }
        arr[++top] = ele;
        System.out.println("*********");
        display();
        System.out.println("*********");

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        for (int e : arr) {
            System.out.println(e);
        }
    }
}