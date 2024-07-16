package STACK;

//IMPLEMENT STACK USING LINKEDLIST
/*
 * Time Complexity: O(1), for all push(), pop(), and peek(), TOTAL TC=O(1)
 * Auxiliary Space: O(N), where N is the size of the stack
 */
//Code in gfg
class Sttack {
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

    // Push pop and peek operations will take TC=O(1)
    // AS head of linked list is a top of our stack
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

public class Implementation2 {
    public static void main(String[] args) {
        Sttack s = new Sttack();
        // object of class Stack created

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
// CODING NINJAS
/*
 * public class Solution {
 * static class Stack {
 * Node head;
 * int size;
 * Stack()
 * {
 * head=null;
 * size=0;
 * }
 * 
 * int getSize()
 * {
 * return size;
 * }
 * 
 * boolean isEmpty()
 * {
 * return head==null;
 * }
 * 
 * void push(int data)
 * {
 * Node n= new Node(data);
 * if(head==null){
 * head=n;
 * size++;
 * return;
 * }
 * n.next=head;
 * head=n;
 * size++;
 * }
 * 
 * void pop()
 * {
 * if(isEmpty()){
 * return;
 * }
 * head=head.next;
 * size--;
 * }
 * 
 * int getTop()
 * {
 * if(isEmpty()){
 * return -1;
 * }
 * return head.data;
 * }
 * }
 * }
 * 
 */