package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodefromLast {
    Node head;

    public void addLast(int i) {
        Node newNode = new Node(i);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + "-->");
            currentnode = currentnode.next;
        }
        System.out.println("NULL");
    }

    // DELETE NTH node from last
    // TC=O(2N) in worst case SC=O(1)
    // Brute Force
    public Node deletefromlast(Node head, int n) {
        if (head == null) {
            return null;
        }
        // DONT WRITE CONDITION FOR SINGLE ELEMENT THAT IS (IF head.next==null THEN
        // DELETE FIRST ELEMENT)
        // CAUSE IT IS ALREADY COVERED IN (n==size) CONDITION
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        if (n == size) {
            return head.next;
        }
        int i = 1;
        Node prev = head;
        int searchprevIndex = size - n;
        while (i < searchprevIndex) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    // BRUTE FORCE
    // ANOTHER BETTER WAY TO WRITE BRUTE FORCE
    /*
     * public Node dltfromlast(ListNode head, int n ) {
     * if (head == null) {
     * return null;
     * }
     * int size = 0;
     * ListNode temp = head;
     * while (temp != null) {
     * size++;
     * temp = temp.next;
     * }
     * if (size == n) {
     * head = head.next;
     * return head;
     * }
     * int index = size - n;
     * ListNode current = head;
     * int i = 0;
     * while (current != null) {
     * i++;
     * if (i == index) {
     * current.next = current.next.next;
     * break;
     * }
     * current = current.next;
     * }
     * return head;
     * }
     */

    // Optimised Approach
    // TC=O(N) SC=O(1)
    public Node optimisedlastnode(Node head, int n) {
        if (head == null) {
            return head;
        }

        Node fast = head;
        Node slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            // Means if n==size
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        DeleteNodefromLast del = new DeleteNodefromLast();
        for (int i = 0; i < arr.length; i++) {
            del.addLast(arr[i]);
        }
        del.printList();
        // Brute force
        int n = 2;// Cant Take invalid position or else wrong output will be provided
        // del.head = del.deletefromlast(del.head, n);
        // del.printList();
        // Optimised Approach
        del.head = del.optimisedlastnode(del.head, n);
        del.printList();
    }
}
