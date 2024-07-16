package STACK;

import java.util.*;

//STACK USING JAVA COLLECTIONS
public class Implementation5 {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            System.out.println("Now size is " + s.size());
            s.pop();
        }
    }
}
