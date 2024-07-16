package STACK;

//IMPLEMENT STACK USING ARRAYS
/*
TC:
push: O(1)
pop: O(1)
peek: O(1)
is_empty: O(1)
is_full: O(1)
//TOTAL TC=O(1)
Auxiliary Space: O(n), where n is the number of items in the stack.
 */
class Sttaack {
    int size = 1000;
    int top = -1;
    int a[] = new int[size];

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("ARRAY FILLED");
            return;
        }
        a[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("ARRAY EMPTY");
            return -1;
        }
        int y = a[top];
        top--;
        return y;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("ARRAY EMPTY");
            return -1;
        }
        return a[top];
    }

    public void print() {
        for (int i = top; i > -1; i--) {
            System.out.println(a[i]);
        }
    }
}

public class Implementation1 {
    public static void main(String[] args) {
        Sttaack s = new Sttaack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        // s.print();
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
