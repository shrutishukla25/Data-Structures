package STACK;

import java.util.*;

//OPTIMISED SOLUTION OF FIRST TWO IMPLEMENTATIONS
// TOTAL SC=O(N)
//TOTAL TC=O(N)
// IMPLEMENT STACK USING SINGLE QUEUE
class Stackusing1queue {
    Queue<Integer> q = new LinkedList<>();

    // TC=O(1)
    public boolean isEmpty() {
        return q.isEmpty();
    }

    // TC=O(N)
    public void push(int data) {
        q.add(data);
        for (int i = 0; i < q.size() - 1; i++) {
            int k = q.remove();
            q.add(k);
        }
    }

    // TC=O(1)
    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        return q.remove();
    }

    // TC=O(1)
    public int peek() {
        if (isEmpty()) {
            return 0;
        }
        return q.peek();
    }
}

public class Implementation004 {
    public static void main(String[] args) {
        Stackusing1queue q = new Stackusing1queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }
}
