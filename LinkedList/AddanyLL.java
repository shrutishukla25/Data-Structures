package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddanyLL {
    Node head;

    public void AddLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }

    public void printlist(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // ADD ANY NODE AT ANY POSITION
    public Node addatposition(Node head, int el, int pos) {
        if (head == null) {
            if (pos == 1) {
                Node newpos = new Node(el);
                head = newpos;
                return head;
            } else {
                return head;
            }
        }
        if (pos == 1) {
            // Always remember condition of position 1 should be written Individually and it
            // is important to write it
            // As our head depends on it
            Node newpos = new Node(el);
            newpos.next = head;
            head = newpos;
            return head;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            // Here its important to check if temp !=null
            count++;
            if (count == pos - 1) {
                Node newpos = new Node(el);
                newpos.next = temp.next;
                temp.next = newpos;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public Node addbeforevalue(Node head, int ele, int val) {
        if (head == null) {
            return head;
        }
        if (val == head.data) {
            Node newval = new Node(ele);
            newval.next = head;
            head = newval;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == val) {
                Node newval = new Node(ele);
                newval.next = temp.next;
                temp.next = newval;
                break;

            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String args[]) {
        AddanyLL a = new AddanyLL();
        a.AddLast(10);
        a.AddLast(11);
        a.AddLast(12);
        a.AddLast(13);
        a.printlist(a.head);
        // Now i wanna add element 15 at position 3
        int el = 15, pos = 2;
        a.head = a.addatposition(a.head, el, pos);
        a.printlist(a.head);
        // Now i wanna add element 18 before value 12
        int ele = 18, val = 12;
        a.head = a.addbeforevalue(a.head, ele, val);
        a.printlist(a.head);

    }

}
