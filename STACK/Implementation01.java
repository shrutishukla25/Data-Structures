package STACK;

//IMPLEMENTATION USING ARRAY CODING NINJAS
class Stackies {
    int arr[];
    int top;
    int capacity;

    Stackies(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        arr = new int[capacity];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int x = arr[top];
        top--;
        return x;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        int x = arr[top];
        return x;
    }

    public void push(int a) {
        if (isFull()) {
            System.out.println("Stack Full");
            return;
        }
        arr[++top] = a;
    }
}
/*
 * // GFG
 * class MyStack
 * {
 * int top;
 * int arr[] = new int[1000];
 * 
 * MyStack()
 * {
 * top = -1;
 * }
 * boolean isEmpty(){
 * return top==-1;
 * }
 * 
 * //Function to push an integer into the stack.
 * void push(int a)
 * {
 * arr[++top]=a;
 * }
 * 
 * //Function to remove an item from top of the stack.
 * int pop()
 * {
 * if(isEmpty()){
 * return -1;
 * }
 * int x=arr[top--];
 * return x;
 * 
 * }
 * }
 */

public class Implementation01 {
    public static void main(String[] args) {
        Stackies s = new Stackies(5);
        // My Stack capacity is 5;
        // So 5 will be Capacity(size) of array
        // I can pass any size from here
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
