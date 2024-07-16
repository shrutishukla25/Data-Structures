package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteanyNode {

    public void printlist(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + "-->");
            currentnode = currentnode.next;
        }
        System.out.println("null");
    }

    public void addLast(int data, Node head) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currentnode = head;
        while (currentnode.next != null) {
            currentnode = currentnode.next;
        }
        currentnode.next = newnode;
    }

    public void DeleteNode(Node delnode) {
        /*
         * There is a singly-linked list head and we want to delete a node node in it.
         * 
         * You are given the node to be deleted node.YOU WILL NOT BE GIVEN ACCESS TO THE
         * FIRST NODE OF HEAD.
         * 
         * All the values of the linked list are unique, and it is GUARANTEED THAT THE
         * GIVEN NODE IS NOT THE LAST NODE in the linked list.
         * 
         * Delete the given node. Note that by deleting the node, we do not mean
         * removing it from memory. We mean:
         * 
         * The value of the given node should not exist in the linked list.
         * The number of nodes in the linked list should decrease by one.
         * All the values before node should be in the same order.
         * All the values after node should be in the same order.
         */
        delnode.data = delnode.next.data;
        delnode.next = delnode.next.next;
    }

    public void DeleteNodelast(Node second, Node head) {
        /*
         * There is a singly-linked list head and we want to delete a node node in it.
         * 
         * You are given the node to be deleted node.YOU WILL BE GIVEN ACCESS TO THE
         * FIRST NODE OF HEAD.
         * 
         * All the values of the linked list are unique, and
         * GIVEN NODE CAN BE THE LAST NODE in the linked list.
         * 
         * Delete the given node. Note that by deleting the node, we do not mean
         * removing it from memory. We mean:
         * 
         * The value of the given node should not exist in the linked list.
         * The number of nodes in the linked list should decrease by one.
         * All the values before node should be in the same order.
         * All the values after node should be in the same order.
         */
        if (second.next != null) {
            second.data = second.next.data;
            second.next = second.next.next;
        } else {
            Node temp = head;
            Node prev = null;
            while (temp != null) {
                if (temp.data == second.data) {
                    prev.next = prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        DeleteanyNode d = new DeleteanyNode();
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        d.printlist(head);
        d.DeleteNode(head.next);
        d.printlist(head);
        d.DeleteNodelast(fourth, head);
        d.printlist(head);

    }
}
