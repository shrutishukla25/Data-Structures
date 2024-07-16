package LinkedList;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IflinkedLispalindrome {
    Node head;

    public Node arraytolinkedl(int arr[]) {
        // Time Complexity=O(N)
        head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public void printlist(Node head) {
        if (head == null) {
            System.out.println("null");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // BRUTE FORCE USING STACK DS
    // TC=O(2N) SC=O(N)
    public static boolean isPalindromebrute(Node head) {
        Stack<Integer> s = new Stack<>();
        Node temp = head;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data == s.pop()) {
                temp = temp.next;
            } else {
                return false;
            }
        }
        return true;
    }
    // But Linked List questions are generally not solved like this whatever we need
    // to do we have to do it in current LL
    // Cant use external space HENCE BETTER APPROACH

    public Node reverselink(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextnode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextnode;
        }
        head.next = null;
        head = prevNode;
        return head;
    }

    public boolean betterone(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newhead = reverselink(slow.next);
        Node first = head;
        Node second = newhead;
        while (second != null) {
            if (second.data == first.data) {
                second = second.next;
                first = first.next;
            } else {
                reverselink(newhead);
                return false;
            }
        }
        reverselink(newhead);
        return true;
    }

    public static void main(String[] args) {
        IflinkedLispalindrome m = new IflinkedLispalindrome();
        int arr[] = { 1, 2, 3, 2, 1 };
        m.head = m.arraytolinkedl(arr);
        m.printlist(m.head);
        // System.out.print(isPalindromebrute(m.head));
        System.out.println(m.betterone(m.head));
        m.printlist(m.head);

    }
}
