package LinkedList;

import java.util.*;

public class ReverseLL {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentnode = head;
        while (currentnode.next != null) {
            currentnode = currentnode.next;
        }
        currentnode.next = newNode;

    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + "-->");
            currentnode = currentnode.next;
        }
        System.out.println("NULL");
    }

    // NOW REVERSAL USING ITERATION;
    /*
     * TC=O(N) SC=O(1)
     * public void iterate() {
     * if (head == null || head.next == null) {
     * //It is important to write this corner case
     * return; // Return head here in case of returning a node
     * //Which means returning a list as it is
     * }
     * Node prevNode = head;
     * Node currNode = head.next;
     * while (currNode != null) {
     * Node nextNode = currNode.next;
     * currNode.next = prevNode;
     * prevNode = currNode;
     * currNode = nextNode;
     * }
     * head.next = null;
     * head = prevNode;
     * }
     */
    // Reversal using Recursion
    // TC=O(N) SC =O(N)
    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    // Extreme Naive Approach
    // Take stack TC= O(2N) SC=O(N)
    public void bruteforce() {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ReverseLL r = new ReverseLL();
        r.addLast(1);
        r.addLast(2);
        r.addLast(3);
        r.addLast(4);
        r.printList();
        // r.head = r.reverse(r.head);
        r.bruteforce();
        r.printList();
    }
}
