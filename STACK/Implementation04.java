package STACK;

import java.util.*;

//SC=O(N) 
//TC=Pop operation: O(N),PEEK operation: O(N),Push operation: O(1)
//Implement Stack Using 2 Queues
//BY MAKING POP AND PEEK OPERATION COSTLY
class Stack2usingqueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void push(int data) {
        q1.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int k = q1.remove();
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return k;
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        }
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int k = q1.peek();
        q2.add(q1.remove());
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return k;
    }

}

public class Implementation04 {
    public static void main(String[] args) {
        Stack2usingqueue q = new Stack2usingqueue();
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
