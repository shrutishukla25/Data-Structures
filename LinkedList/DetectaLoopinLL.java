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

public class DetectaLoopinLL {
    public boolean ifhasaloop(Node head) {
        HashMap<Node, Integer> mp = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            if (mp.containsKey(temp)) {
                return true;
            }
            mp.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }

    public boolean detectloopoptimal(Node head) {
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectaLoopinLL ob = new DetectaLoopinLL();
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
        fifth.next = third;
        // System.out.println(ob.ifhasaloop(head));
        System.out.println(ob.detectloopoptimal(head));
    }
}
