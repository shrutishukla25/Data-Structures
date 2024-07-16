package LinkedList;

public class DeleteanyLL {
    Node head;
    private int size;

    DeleteanyLL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // ADD ELEMENTS
    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void printlist(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + "-->");
            currentnode = currentnode.next;
        }
        System.out.println("null");
    }

    public int getsize() {
        return size;
    }

    // Delete any position
    public Node Deletepos(Node head, int pos) {
        // Method will return head of linked list
        // Time Complexity=O(k)
        if (head == null) {
            return head;
        }
        if (pos == 1) {
            // Always remember condition of position 1 should be written Individually and it
            // is important to write it
            // As our head depends on it
            head = head.next;
            return head;
        }
        // Everytime in delete it is mandatory to take two nodes
        int count = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            count++;
            if (count == pos) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
        /*
         * HACKER RANK
         * CAN BE DONE USING ONLY ONE NODE
         * public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int
         * position) {
         * if (position == 0) {
         * llist= llist.next;
         * return llist;
         * }
         * int count = 0;
         * SinglyLinkedListNode temp = llist;
         * 
         * while (temp != null) {
         * if (count == position-1) {
         * temp.next = temp.next.next;
         * break;
         * }
         * count++;
         * temp = temp.next;
         * }
         * return llist;
         * 
         * }
         */
    }

    // Delete any element
    public Node Deleteelement(Node head, int el) {
        // Method will return head of linked list
        // Time Complexity=O(k)
        if (head == null) {
            return head;
        }
        if (head.data == el) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == el) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String args[]) {
        DeleteanyLL l = new DeleteanyLL();
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        l.printlist(l.head);
        System.out.println(l.getsize());
        int pos = 2;// pos 2 is 2(addfirstmethod)
        l.head = l.Deletepos(l.head, pos);
        l.printlist(l.head);
        l.head = l.Deleteelement(l.head, 1);
        l.printlist(l.head);

    }
}
