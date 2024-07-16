package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ArrtoLL {
    Node head;

    public Node arraytolinkedlist(int arr[]) {
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
        // Time COmplexity=O(N)
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

    // length of LinkedList
    public int length(Node head) {
        // TC=O(N)
        int count = 0;
        Node currNode = head;
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        return count;
    }

    // SearcH an element in a linkedlist
    // k is data element here
    public int searchelement(Node head, int k) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == k) {
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 3, 8 };
        ArrtoLL a = new ArrtoLL();
        // suppose i want to search 3 in linked list if it is present or not
        Node s = new Node(arr[2]);
        // a.searchelement(a.head, s.data);
        // a.head = a.arraytolinkedlist(arr);
        // all we need to do is to paas head to print entire list
        a.printlist(a.arraytolinkedlist(arr));
        System.out.println(a.searchelement(a.head, s.data));
        System.out.println(a.length(a.head));

    }
}
