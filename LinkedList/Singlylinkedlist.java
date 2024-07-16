package LinkedList;

public class Singlylinkedlist {
    Node head = null;// By default null even if we mwntion or not
    private int size;

    /*
     * Singlylinkedlist() {
     * this.size = 0;
     * }
     */

    class Node {
        String data;
        Node next;

        Node(String data1) {
            this.data = data1;
            this.next = null;
            size++;
            // next is by default null;
        }
    }

    // ADD FIRST
    // This is a function of LLAditon class
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
            // If we do not apply return here if loop will run infinitely cause loop do not
            // have any terminating condition
        }
        newNode.next = head;
        head = newNode;
    }

    // ADD LAST
    // This is a function of LLAditon class
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // PRINT LIST
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
            // If we do not apply return here it will print "List is Empty" and "null" also
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // DELETE FIRST
    public void deletefirst() {
        // No need to create newNode here
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;// cause node is getting deleted
        head = head.next;// This single line then will delete first
    }

    // DELETE LAST
    public void deleteLast() {
        // No need to create newNode here
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        if (head.next == null) {
            // in case if there is only one node;
            head = head.next;
            return;
            // it is very Important To write return statement here;
        }
        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getsize() {
        return size;
    }

    public static void main(String args[]) {
        Singlylinkedlist list = new Singlylinkedlist();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addlast("list");
        list.printList();
        list.addFirst("This");
        list.printList();
        System.out.println(list.getsize());
        list.deleteLast();
        list.printList();
        System.out.println(list.getsize());
        list.deletefirst();
        list.printList();
        System.out.println(list.getsize());

    }
}
