package STACK;

import java.util.Stack;

//TC=O(N^2) SC=O(N)(Use of Stack)
public class ReverseaStack {
    public static void pushatbottom(int data, Stack<Integer> st) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushatbottom(data, st);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverse(st);
        pushatbottom(top, st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(9);
        st.push(8);
        st.push(7);
        st.push(6);
        reverse(st);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
