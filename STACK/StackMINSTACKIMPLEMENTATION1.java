package STACK;

//MIN STACK IMPLEMENTATION WITH TC=O(1)
import java.util.*;
/*
 * Time Complexity: O(1) Space Complexity: O(2N){As we are storing elements in form of pairs}
 */

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MinStack {
    Stack<Pair> st = new Stack<>();

    public boolean isEmpty() {
        return st.isEmpty();
    }

    public void push(int data) {
        int min = Integer.MAX_VALUE;
        if (st.isEmpty()) {
            min = data;
        } else {
            min = Math.min(data, st.peek().y);
        }
        st.push(new Pair(data, min));
    }

    public int pop() {
        if (st.isEmpty()) {
            return 0;
        }
        int k = st.peek().x;
        st.pop();
        return k;
    }

    public int peek() {
        if (st.isEmpty()) {
            return 0;
        }
        return st.peek().x;
    }

    public int getMin() {
        if (st.isEmpty()) {
            return 0;
        }
        return st.peek().y;
    }
}

public class StackMINSTACKIMPLEMENTATION1 {
    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(-2);
        m.push(0);
        m.push(-3);
        while (!m.isEmpty()) {
            System.out.println(m.peek() + " ");
            m.pop();
        }
    }
}
