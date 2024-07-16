package STACK;

//IMPLEMENT STACK USING 2 QUEUES
// BY MAKING ADD OPERATION COSTLY
import java.util.*;

// SC=O(N) 
// TC=O(N)(PUSH),O(1)(POP),O(1)(PEEK)
class Using2Queues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    boolean isEmpty() {
        return q1.isEmpty();
        // As we are taking elements from q1 and we will check q1 while removing or
        // peeking elements
    }

    public void push(int data) {
        q2.add(data);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        // swap the names of two queues
        Queue<Integer> temp = new LinkedList<>();
        temp = q1;
        q1 = q2;
        q2 = temp;
        /*
         * OR
         * Queue<Integer> temp=q1;
         * q1=q2;
         * q2=temp;
         * 
         */
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        return q1.remove();
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        }
        return q1.peek();
    }

}

public class Implementation4 {
    public static void main(String[] args) {
        Using2Queues q = new Using2Queues();
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
