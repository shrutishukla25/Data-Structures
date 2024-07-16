package Queue;

import java.util.*;

class QUEUEY {
    // QUEUE IMPLEMENTATION USING 2 STACKS
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    boolean isEmpty() {
        return s1.isEmpty();
    }

    void add(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    int remove() {
        if (isEmpty()) {
            return -1;
        }
        return s1.pop();
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }
        return s1.peek();
    }
}

class Queuepractice {
    public static void main(String[] args) {
        QUEUEY Q = new QUEUEY();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove();
        }
    }
}