package LinkedList;

import java.util.*;

//LEETCODE
//How to Merge two sorted lists
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class YQueLL1 {
    // NAIVE APPROACH //TC=O(N1+N2+NlogN+N) //SC=O(N)+O(N) {ArrayList &new LL
    // created}
    public static Node convertArrToLlNaive(ArrayList<Integer> arr) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        for (int a : arr) {
            temp.next = new Node(a);
            temp = temp.next;
        }
        return dummyNode.next;
    }

    public static Node mergeNaive(Node head1, Node head2) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head1;
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }
        temp = head2;
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(arr);
        Node head = convertArrToLlNaive(arr);
        return head;

    }

    // Optimised Approach
    // TC=O(n1+n2){i.e.O(N)} SC=O(1)
    public static Node mergeOpt(Node head1, Node head2) {
        Node t1 = head1, t2 = head2;
        Node dummy = new Node(-1);
        Node temp = dummy;
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
        while (t1 != null) {
            temp.next = t1;
            temp = temp.next;
            t1 = t1.next;
        }
        while (t2 != null) {
            temp.next = t2;
            temp = temp.next;
            t2 = t2.next;
        }
        // OR
        /*
         * if (t1 != null) {
         * temp.next = t1;
         * } else {
         * temp.next = t2;
         * } // Strivers and much logical
         */
        return dummy.next;
    }

    public static void printList(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(4);

        Node head2 = new Node(2);
        head2.next = new Node(5);
        head2.next.next = new Node(6);
        System.out.println("First Sorted List:");
        printList(head1);
        System.out.println("Second Sorted List:");
        printList(head2);
        // Node head = mergeNaive(head1, head2);
        Node head = mergeOpt(head1, head2);
        System.out.println("After Merging Two Sorted Lists:");
        printList(head);
    }
}
