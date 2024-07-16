package Queue;

// IMPLEMENTATION USING ARRAYLIST
import java.util.*;

// TC=O(1) for all operations
// TC remove=O(n) TOTAL TC=O(N)
// SC=O(n)
class QueueUseAl {
    ArrayList<Integer> al = new ArrayList<>();

    public void add(int a) {
        al.add(a);
    }

    public int remove() {
        if (al.isEmpty()) {
            return -1;
        }
        int top = al.get(0);
        al.remove(0);
        return top;
        // OR JUST return al.remove(0);
    }

    public int peek() {
        if (al.isEmpty()) {
            return -1;
        }
        return al.get(0);
    }
}

class IMPLEMENTATION4 {
    public static void main(String[] args) {
        queue obj = new queue(5);
        obj.add(4);
        obj.add(2);
        obj.add(3);
        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            // System.out.println(obj.remove());
            obj.remove();
        }
    }
}
