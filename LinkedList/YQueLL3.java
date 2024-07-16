package LinkedList;

import java.util.*;

//Segregate even and odd nodes in LinkedList
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class YQueLL3 {
    public static void printList(Node head) {
        if (head == null) {
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static Node naiveAgrregation(Node head) {
        // TC=O(2N) SC=O(N)
        if (head == null || head.next == null) {
            return head;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        while (temp != null && temp.next != null) {
            arr.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            arr.add(temp.data);
            // In case LL has odd length
        }
        temp = head.next;
        while (temp != null && temp.next != null) {
            arr.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            arr.add(temp.data);
            // In case LL has has only 2 nodes
        }
        temp = head;
        for (int a : arr) {
            temp.data = a;
            temp = temp.next;
        }
        return head;
    }

    public static Node optimisedAggregation(Node head) {
        // TC=O(N/2)*2==O(N)
        // SC=O(1)
        if (head == null || head.next == null) {
            return head;
        }
        Node odd = head, even = head.next, evenHead = head.next;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // head.next.next.next.next.next = new Node(6);
        System.out.println("Original Linked List");
        printList(head);
        // head = naiveAgrregation(head);
        head = optimisedAggregation(head);
        System.out.println("After seggregating odd and even indexes of nodes");
        printList(head);

    }
}
