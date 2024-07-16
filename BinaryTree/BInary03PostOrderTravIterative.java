package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Iterative way using 2 stacks
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

public class BInary03PostOrderTravIterative {
    // Time Complexity: O(2N) Space Complexity: O(2N)
    public static List<Integer> iterativePostorder(Node root) {
        List<Integer> postOrder = new ArrayList<>();
        if (root == null) {
            return postOrder;
        }
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while (!st1.isEmpty()) {
            Node current = st1.pop();
            st2.push(current);
            if (current.left != null) {
                st1.push(current.left);
            }
            if (current.right != null) {
                st1.push(current.right);
            }
        }
        while (!st2.isEmpty()) {
            postOrder.add(st2.pop().data);
        }
        return postOrder;
    }

    public static void printlist(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
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

        List<Integer> list = iterativePostorder(root);
        // System.out.println(list);
        // or call printlist function
        printlist(list);
    }
}
