package STACK;

import java.util.*;
//LEETCODE
//MIN STACK IMPLEMENTATION WITH TC=O(1) OPTIMISED
//TC=O(1)
//SC=O(N)

class Minstackimplementation {
    // Make Stack Of Long Instead of integer cause whenvr a data is going to appear
    // in a form of integer we are going to store after multipying it by 2 that is
    // double of it so take long So thr Stack doesnt overflows

    Stack<Long> st = new Stack<>();
    Long min = Long.MAX_VALUE;

    public boolean isEmpty() {
        return st.isEmpty();
    }

    public void push(int data) {
        Long val = Long.valueOf(data);
        if (st.isEmpty()) {
            st.push(val);
            min = val;
            return;
        }
        if (data < min) {
            st.push(2 * val - min);
            min = val;
            return;
        }
        st.push(val);
    }

    public int pop() {
        if (st.isEmpty()) {
            return 0;
        }
        if (st.peek() < min) {
            Long k = min;
            min = (2 * min) - st.peek();
            st.pop();
            return k.intValue();
        }
        return st.pop().intValue();
    }

    public int peek() {
        if (st.isEmpty()) {
            return 0;
        }
        if (st.peek() < min) {
            return min.intValue();
        }
        return st.peek().intValue();
    }

    public int getMin() {
        if (st.isEmpty()) {
            return 0;
        }
        return min.intValue();
    }

}

public class StackMINSTACKIMPLEMENTATION01 {
    public static void main(String[] args) {
        Minstackimplementation m = new Minstackimplementation();
        m.push(3);
        m.push(5);
        m.push(2);
        m.push(1);
        m.push(1);
        m.push(-1);
        while (!m.isEmpty()) {
            System.out.println(m.getMin() + " ");
            m.pop();
        }
    }
}
