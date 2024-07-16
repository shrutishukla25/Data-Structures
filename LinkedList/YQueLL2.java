package LinkedList;

//LEETCODE
// SOrt LinkedList
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class YQueLL2 {
    // Naive Approach(Using ArrayList)
    public static void sortLLNAive(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        // TC=O(n+nlogn+n) Sc=O(n)
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(arr);
        temp = head;
        for (int j = 0; j < arr.size(); j++) {
            temp.data = arr.get(j);
            temp = temp.next;
        }
    }

    // Optimised Approach SOrt LL using Merge sORT
    // TC=O(logN)*O(N+N/2) SC=O(1)
    public static Node findMiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node mergeTwoSortedList(Node left, Node right) {
        Node t1 = left;
        Node t2 = right;
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                temp.next = t1;
                temp = temp.next;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = temp.next;
                t2 = t2.next;
            }
        }
        if (t1 != null) {
            temp.next = t1;
        } else {
            temp.next = t2;
        }
        return dummyNode.next;
    }

    public static Node sortLLOptimised(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node middle = findMiddle(head);
        Node leftHead = head;
        Node rightHead = middle.next;
        middle.next = null;
        leftHead = sortLLOptimised(leftHead);
        rightHead = sortLLOptimised(rightHead);
        return mergeTwoSortedList(leftHead, rightHead);
    }

    public static void print(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.next = new Node(6);
        head.next.next = new Node(3);
        head.next.next.next = new Node(8);

        System.out.println("Original Linked List is:");
        print(head);
        // sortLLNAive(head);
        head = sortLLOptimised(head);
        System.out.println("Sorted Linked List is:");
        print(head);

    }
}
