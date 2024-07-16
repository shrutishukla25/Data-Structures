package BinaryTree;

import java.util.*;

//Iterative way using 1 stack
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// TC=O(2N) SC=O(N)
public class BInary003PostOrderTravIterative {
    public static List<Integer> iterative2Postorder(Node root) {
        List<Integer> postOrder = new ArrayList<>();
        if (root == null) {
            return postOrder;
        }
        Stack<Node> st = new Stack<>();
        Node current = root;
        while (current != null || !st.isEmpty()) {
            if (current != null) {
                st.push(current);
                current = current.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.pop();
                    postOrder.add(temp.data);
                    while (!st.isEmpty() && st.peek().right == temp) {
                        temp = st.pop();
                        postOrder.add(temp.data);
                    }
                } else {
                    current = temp;
                }
            }
        }
        return postOrder;

    }

    public static void printlist(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.left.right = new Node(7);
        root.right.left.right.right = new Node(8);

        List<Integer> list = iterative2Postorder(root);
        // System.out.println(list);
        // or call printlist function
        printlist(list);
    }
}
