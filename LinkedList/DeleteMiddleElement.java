package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteMiddleElement {
    Node head;

    public void addfirst(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public void printthis(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    // TC=O(N)+O(N/2) SC=O(1)
    public Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        int beforemiddle = size / 2;
        int i = 1;
        Node traverse = head;
        while (i < beforemiddle) {
            traverse = traverse.next;
            i++;
        }
        traverse.next = traverse.next.next;
        return head;
    }

    // Optimal COde TC=O(N/2) SC=O(1)
    public Node deleteoptimalMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head, fast = head;
        fast = fast.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        DeleteMiddleElement d = new DeleteMiddleElement();
        d.addfirst(5);
        d.addfirst(4);
        d.addfirst(3);
        d.addfirst(2);
        d.addfirst(0);
        d.printthis(d.head);
        // d.head = d.deleteMiddle(d.head);
        d.head = d.deleteoptimalMiddle(d.head);
        d.printthis(d.head);
    }
}
