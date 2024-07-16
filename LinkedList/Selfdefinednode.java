package LinkedList;

class Node {
    // Node is created
    int data;
    Node next;

    // Parameterised COnstructor for nOde
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class Selfdefinednode {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3 };
        Node n = new Node(arr[2]);
        System.out.println(n.data);
    }
}
