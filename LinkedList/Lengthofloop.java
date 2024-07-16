package LinkedList;

import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Lengthofloop {
    public static int usingHashSet(Node head) {
        HashSet<Node> map = new HashSet<>();
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (map.contains(temp)) {
                count++;
                Node startNode = temp;
                startNode = startNode.next;
                while (startNode != temp) {
                    count++;
                    startNode = startNode.next;
                }
                return count;
            }
            map.add(temp);
            temp = temp.next;
        }
        return 0;
    }

    public int calculateLoopLength(Node slow, Node fast) {
        int c = 0;
        c++;
        fast = fast.next;
        while (fast != slow) {
            c++;
            fast = fast.next;
        }
        return c;
    }

    public static int UsingHandT(Node head) {
        Lengthofloop l = new Lengthofloop();
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                // LOOP DETECTED
                return l.calculateLoopLength(slow, fast);
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        Node head = new Node(5);
        Node second = new Node(5);
        Node third = new Node(5);
        Node fourth = new Node(5);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        // System.out.println("Length of loop is " + usingHashSet(head));
        System.out.println("Length of loop is " + UsingHandT(head));

    }
}
