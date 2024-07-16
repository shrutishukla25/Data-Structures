package STACK;

import java.util.*;

// Refer Coding Ninjas also
//Push at bottom using recursion and collection frameworks
public class Pushatbottom {

    public static void pushelementatbottom(int data, Stack<Integer> st) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushelementatbottom(data, st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(8);
        st.push(9);
        st.push(56);
        pushelementatbottom(71, st);

        System.out.println("Stack after pushing element at bottom");
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }

    }
}
