package dsa.basics;

import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {

        /*
         ===============================
          🧠 STACK - INTRODUCTION
         ===============================
          ➤ A Stack is a data structure that follows LIFO (Last In, First Out)
            Example: Stack of plates — the last one you put is the first you remove.

          ➤ Basic Operations:
            1. push()  → Add element on top
            2. pop()   → Remove top element
            3. peek()  → See top element (without removing)
            4. isEmpty() → Check if stack has elements
            5. search(element) → Find position of element from top (1-based index)
        */

        System.out.println("=== Stack using Java's built-in class ===");
        Stack<Integer> stack = new Stack<>();

        // 1️⃣ Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after pushes: " + stack); // [10, 20, 30, 40]

        // 2️⃣ Peek element (top)
        System.out.println("Top element (peek): " + stack.peek()); // 40

        // 3️⃣ Pop element
        System.out.println("Popped: " + stack.pop()); // removes 40
        System.out.println("Stack after pop: " + stack); // [10, 20, 30]

        // 4️⃣ Search element (from top)
        System.out.println("Position of 20 from top: " + stack.search(20)); // 2

        // 5️⃣ Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false


        /*
         ===============================
          🧩 STACK IMPLEMENTATION USING ARRAY
         ===============================
          Let's implement our own stack to understand internal working.
         ===============================
        */

        System.out.println("\n=== Stack using Array (Custom Implementation) ===");

        MyStack myStack = new MyStack(5);
        myStack.push(5);
        myStack.push(10);
        myStack.push(15);
        myStack.display();

        System.out.println("Top element: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        myStack.display();

        System.out.println("Is empty? " + myStack.isEmpty());
        System.out.println("Is full? " + myStack.isFull());


        /*
         ===============================
          💡 REAL LIFE USES OF STACK
         ===============================
          ✔ Undo/Redo in text editors
          ✔ Browser Back/Forward
          ✔ Expression Evaluation (like (a+b)*c)
          ✔ Function call stack in programming
        */

    }
}

// ------------------- Custom Stack Implementation -------------------

class MyStack {
    private int[] arr;
    private int top;
    private int capacity;

    public MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // push operation - O(1)
    public void push(int data) {
        if (isFull()) {
            System.out.println("❌ Stack Overflow! Cannot push " + data);
            return;
        }
        arr[++top] = data;
        System.out.println("✅ Pushed: " + data);
    }

    // pop operation - O(1)
    public int pop() {
        if (isEmpty()) {
            System.out.println("❌ Stack Underflow! Nothing to pop.");
            return -1;
        }
        return arr[top--];
    }

    // peek operation - O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("❌ Stack is empty.");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        System.out.print("Current Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
