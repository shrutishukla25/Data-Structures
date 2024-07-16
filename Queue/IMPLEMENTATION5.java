package Queue;

// IMPLEMENATATION USING JAVA COLLECTIONS
import java.util.*;
import java.util.LinkedList;

public class IMPLEMENTATION5 {
    public static void main(String[] args) {
        Queue<Integer> ob = new LinkedList<>();
        // Queue<Integer> ob = new ArrayDeque<>();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        while (!ob.isEmpty()) {
            System.out.println(ob.peek());
            ob.remove();
        }

    }
}
