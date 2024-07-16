package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleElementofLL {
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

    public Node returnMiddle(Node head) {
        // TC=O(2N) SC=O(1)
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int middleindex = (count / 2) + 1;
        middleindex = middleindex - 1;
        Node middlenode = head;
        while (middleindex != 0) {
            middlenode = middlenode.next;
            middleindex--;
        }
        return middlenode;
    }

    public Node TortoiseAndHare(Node head) {
        // TC=O(N/2)
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        MiddleElementofLL obj = new MiddleElementofLL();
        int arr[] = { 1, 2, 3, 4, 2, 1 };
        obj.head = obj.arraytolinkedl(arr);
        obj.printlist(obj.head);
        // Node s = obj.returnMiddle(obj.head);
        // System.out.println(s.data);
        Node n = obj.TortoiseAndHare(obj.head);
        System.out.println(n.data);
    }
}
