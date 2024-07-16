package Queue;

//QUEUE IMPLEMENTATION USING 2 STACKS
//BY MAKING ADD OPERATION COSTLY
// Definitely refer as well to LEETCODE
import java.util.*;
// TC=Add=O(n), remove =O(1), peek=O(1) Total TC=O(N)
//SC=O(2N)

class QueueusingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Queue is Empty when Both the stacks are empty
    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void add(int a) {
        while (!s1.isEmpty()) {
            /*
             * int f = s1.pop();
             * s2.push(f);
             */
            s2.push(s1.pop());
        }
        s1.push(a);
        while (!s2.isEmpty()) {
            /*
             * int k = s2.pop();
             * s1.push(k);
             */
            s1.push(s2.pop());
        }

    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int top = s1.pop();
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return s1.peek();
    }

}

class IMPLEMENTATION6 {
    public static void main(String[] args) {
        QueueusingStacks qs = new QueueusingStacks();
        qs.add(4);
        qs.add(5);
        qs.add(8);
        qs.add(9);
        while (!qs.isEmpty()) {
            System.out.println(qs.peek());
            qs.remove();
        }
    }
}