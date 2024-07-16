package Queue;

//DEFINITELY CHECK IN LEETCODE
//THIS IS OPTIMISATION OF PREVIOUS IMPLEMENTATION
//QUEUE IMPLEMENTATION USING 2 STACKS
// BY MAKING REMOVE & PEEK OPERATION COSTLY
import java.util.*;

//TOTAL Time Complexity: O(1)
//TOTAL SC=O(2N);
//Remove and peek Operations can have O(1) or O(n) time complexity
//==> O(1) when all elements are already shifted and all we have to do is return top element
//SO IN CASE OF REMOVE AND PEEK WE CAN SAY TIME COMPLEXITY IS O(1) OR AMORTISED O(1)
class Queueie {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // TC=O(1)
    boolean isEmpty() {
        return s2.isEmpty() && s1.isEmpty();
    }

    // TC=O(1)
    void add(int data) {
        s1.push(data);
    }

    int remove() {
        if (isEmpty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();

    }

}

public class IMPLEMENTATION06 {
    public static void main(String[] args) {
        Queueie s = new Queueie();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }
}