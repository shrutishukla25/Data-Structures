package STACK;

import java.util.*;

class minstackprac {
    Stack<Long> st = new Stack<>();
    Long min = Long.MAX_VALUE;

    public void push(int x) {
        Long val = Long.valueOf(x);
        if (st.isEmpty()) {
            st.push(val);
            min = val;
            return;
        } else if (val < min) {
            st.push((2 * val) - min);
            min = val;
            return;
        }
        st.push(val);
    }

    public int pop() {
        if (st.isEmpty()) {
            return -1;
        }
        if (st.peek() < min) {
            Long k = min;
            min = ((2 * min) - st.pop());
            return k.intValue();
        }
        return st.pop().intValue();
    }

    public int peek() {
        if (st.isEmpty()) {
            return -1;
        }
        if (st.peek() < min) {
            return min.intValue();
        }
        return st.peek().intValue();
    }

    public int getMin() {
        if (st.isEmpty()) {
            return -1;
        }
        return min.intValue();
    }
}

class stackprac {
    public static void main(String[] args) {
        minstackprac obj = new minstackprac();
        obj.push(-2);
        // System.out.println(obj.getMin());
        // System.out.println(obj.pop());
        obj.push(0);
        /*
         * System.out.println(obj.getMin());
         * System.out.println(obj.peek());
         */
        obj.push(-3);
        System.out.println(obj.getMin());
        System.out.println(obj.pop());
    }
}