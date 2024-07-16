package Queue;

//IMPLEMENT QUEUE USING LINKED LIST
//TC of REMOVE() PEEK() ADD() OPERATION IS O(1) //TOTAL TC=O(1)
//SC=O(N)
class QueueUsinglist {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    // isFull() Method is not Required as Linked List is Variable size data
    // structure
    public void add(int data) {
        Node newnode = new Node(data);
        if (tail == null) {
            /*
             * This condition could be(if(head==null))
             * OR if(head==null&&tail==null)
             */
            // Adding FIrst Element
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;

    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }
}

public class IMPLEMENTATION3 {
    public static void main(String[] args) {
        QueueUsinglist obj = new QueueUsinglist();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.remove();
        }

    }
}
