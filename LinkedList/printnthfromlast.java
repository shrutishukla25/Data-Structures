package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class printnthfromlast {
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

    // THIS CODE ALSO COVERS THE CASES OF INVALID POSITIONS IF GIVEN
    public int printfromlast(Node head, int n) {
        if (head == null) {
            return 0;
        }
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size == n) {
            return head.data;
        }
        if (n > size) {
            return -1;
        }
        int index = size - n + 1;
        Node current = head;
        int i = 0;
        while (current != null) {
            i++;
            if (i == index) {
                return current.data;
            }
            current = current.next;
        }
        return 0;

    }
    /*
     * int getNthFromLast(Node head, int n)
     * {
     * int size=0;
     * Node temp=head;
     * while(temp!=null){
     * size++;
     * temp=temp.next;
     * }
     * if(n>size){
     * return -1;
     * }
     * Node slow=head;
     * Node fast=head;
     * for(int i=0;i<n;i++){
     * fast=fast.next;
     * }
     * if(fast==null){
     * return head.data;
     * }
     * 
     * while(fast!=null){
     * slow=slow.next;
     * fast=fast.next;
     * }
     * return slow.data;
     * }
     */

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        printnthfromlast de = new printnthfromlast();
        for (int i = 0; i < arr.length; i++) {
            de.addLast(arr[i]);
        }
        int n = 5;
        System.out.println(n + "th Value from last is");
        System.out.print(de.printfromlast(de.head, n));

    }
}
