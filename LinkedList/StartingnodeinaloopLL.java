package LinkedList;

import java.util.HashMap;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StartingnodeinaloopLL {

    public Node stpoint(Node head) {
        HashMap<Node, Integer> map = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            if (map.containsKey(temp)) {
                return temp;
            }
            map.put(temp, 1);
            temp = temp.next;
        }
        return null;
    }

    public Node tortoisemethod(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // meaning there is a loop(slow and fast meets at any random node(not the
                // starting node) and indicates
                // that there is a
                // loop)
                // if there is a loop
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        StartingnodeinaloopLL obj = new StartingnodeinaloopLL();
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = second;
        // Node n = obj.stpoint(head);
        Node n = obj.tortoisemethod(head);
        if (n != null) {
            System.out.println("Starting Node of loop is " + n.data);
        } else {
            System.out.println("Loop not detected");
        }
    }
}
