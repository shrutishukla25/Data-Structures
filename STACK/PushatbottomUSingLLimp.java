package STACK;

//PROGRAM FO PUSH AT BOTTOM BUT HERE WE ARE GONNA USE LINKED LIST IMPLEMENTATION 
//OF STACK INSTEAD OF COLLECTION FRAMEWORK
// SC=O(N) TC=O(N)
class StackLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        size--;
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public int size() {
        return size;
    }
}

public class PushatbottomUSingLLimp {
    public static void pushelementatbottom(int data) {
        StackLL sl = new StackLL();
        if (sl.isEmpty()) {
            sl.push(data);
            return;
        }
        int top = sl.pop();
        pushelementatbottom(data);
        sl.push(top);
    }

    public static void main(String[] args) {
        StackLL sl = new StackLL();
        sl.push(6);
        sl.push(9);
        sl.push(84);
        pushelementatbottom(71);

        System.out.println("Stack after pushing element at bottom");
        while (!sl.isEmpty()) {
            System.out.println(sl.peek());
            sl.pop();
        }

    }

}
