package STACK;

//IMPLEMENT STACK USING ARRAYLIST
import java.util.*;
// TC=O(1) in all cases TOTAL TC=O(1)
// SC=O(N)

class stack {
    ArrayList<Integer> arr = new ArrayList<>();

    public boolean isEmpty() {
        return arr.size() == 0;
    }

    // PUSH
    public void push(int a) {
        arr.add(a);
    }

    // POP
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = arr.get(arr.size() - 1);
        // index number inside get and remove method as an arguments
        arr.remove(arr.size() - 1);
        return top;
    }

    // PEEK
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        int print = arr.get(arr.size() - 1);
        return print;
    }

}

public class Implementation3 {
    public static void main(String args[]) {
        stack s = new stack();
        // object of class Stack created

        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}
